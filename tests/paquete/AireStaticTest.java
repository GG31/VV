package paquete;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

//Necesario para el stub de los métodos RunWith y PrepareForTest
@RunWith(PowerMockRunner.class)
@PrepareForTest(AireStatic.class)
public class AireStaticTest {

	/**
	 * Test de catetoMayorTrianguloRectangulo, entrada catetoMenor = 1 e
	 * hipotenusa = 2. El resultado es redondeado con dos números detrás de la
	 * coma.
	 */
	@Test
	public void testCatetoMayorTrianguloRectangulo() {
		float catetoMenor = 1;
		float hipotenusa = 2;
		float salidaEsperada = (float) 1.73;

		float salida = (float) ((int) ((AireStatic
				.catetoMayorTrianguloRectangulo(catetoMenor, hipotenusa) * 100)) / 100.0);
		assertTrue(salida == salidaEsperada);
	}

	/**
	 * Test de areaTrianguloRectangulo
	 */
	@Test
	public void testAreaTrianguloRectangulo() {
		float catetoMenor = 1;
		float catetoMayor = 2;
		float salidaEsperada = 1;
		assertTrue(AireStatic.areaTrianguloRectangulo(catetoMenor, catetoMayor) == salidaEsperada);
	}

	/**
	 * Test de areaTrianguloEquilatero. Los métodos areaTrianguloRectangulo y
	 * catetoMayorTrianguloRectangulo devuelven 1 cuando esten llamados.
	 */
	@Test
	public void testAreaTrianguloEquilatero() {
		float lado = 2;
		float salidaEsperada = 2;
		float devuelve = 1;
		//Stub de areaTrianguloRectangulo
		PowerMock.stub(
				PowerMock.method(AireStatic.class, "areaTrianguloRectangulo"))
				.toReturn(devuelve);
		//Stub de catetoMayorTrianguloRectangulo
		PowerMock.stub(
				PowerMock.method(AireStatic.class,
						"catetoMayorTrianguloRectangulo")).toReturn(devuelve);
		assertTrue(AireStatic.areaTrianguloEquilatero(lado) == salidaEsperada);
	}

	/**
	 * Test de areaCuadrado
	 */
	@Test
	public void testAreaCuadrado() {
		float lado = 2;
		float salidaEsperada = 4;
		assertTrue(AireStatic.areaCuadrado(lado) == salidaEsperada);
	}

	/**
	 * Test de areaEstrella. areaTrianguloEquilatero y areaCuadrado devuelven 1
	 * cuando esten llamados.
	 */
	@Test
	public void testAreaEstrella() {
		float lado = 2;
		float salidaEsperada = 5;
		float devuelve = 1;
		//Stub de areaTrianguloEquilatero
		PowerMock.stub(
				PowerMock.method(AireStatic.class, "areaTrianguloEquilatero"))
				.toReturn(devuelve);
		//Stub de areaCuadrado
		PowerMock.stub(PowerMock.method(AireStatic.class, "areaCuadrado"))
				.toReturn(devuelve);
		assertTrue(AireStatic.areaEstrella(lado) == salidaEsperada);
	}

}

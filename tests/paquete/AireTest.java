package paquete;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AireTest {
	Aire a;

	@Before
	public void setUp() {
		a = new Aire();
	}

	@After
	public void tearDown() {
		a = null;
	}

	/**
	 * Test de catetoMayorTrianguloRectangulo, entrada catetoMenor = 1 e
	 * hipotenusa = 2 El resultado es redondeado con dos números detrás de la
	 * coma.
	 */
	@Test
	public void testCatetoMayorTrianguloRectangulo() {
		float catetoMenor = 1;
		float hipotenusa = 2;
		float salidaEsperada = (float) 1.73;
		float salida = (float) ((int) ((a.catetoMayorTrianguloRectangulo(
				catetoMenor, hipotenusa) * 100)) / 100.0);
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
		assertTrue(a.areaTrianguloRectangulo(catetoMenor, catetoMayor) == salidaEsperada);
	}

	/**
	 * Test de areaTrianguloEquilatero. El objeto Aire se crea con una clase
	 * anónima donde podemos redefinir las funcciones areaTrianguloRectangulo y
	 * catetoMayorTrianguloRectangulo que son llamadas por
	 * areaTrianguloEquilatero para que devuelvan 1. Así, sólo se prueba la
	 * funccion areaTrianguloEquilatero.
	 */
	@Test
	public void testAreaTrianguloEquilatero() {
		float lado = 2;
		float salidaEsperada = 2;

		Aire c = new Aire() {
			public float areaTrianguloRectangulo(float catetoMenor,
					float catetoMayor) {
				return 1;
			}

			public float catetoMayorTrianguloRectangulo(float catetoMenor,
					float hipotenusa) {
				return 1;
			}
		};
		assertTrue(c.areaTrianguloEquilatero(lado) == salidaEsperada);
	}

	/**
	 * Test de areaCuadrado, este funccion no depende de otra funccion, así se
	 * sirve del objecto
	 */
	@Test
	public void testAreaCuadrado() {
		float lado = 2;
		float salidaEsperada = 4;
		assertTrue(a.areaCuadrado(lado) == salidaEsperada);
	}

	/**
	 * Test de areaEstrella. Esta funccion llama a areaTrianguloEquilatero y a
	 * areaCuadrado, por eso se utiliza una clase anónima para redefinir estas
	 * últimas funcciones para que devuelvan 1.
	 */
	@Test
	public void testAreaEstrella() {
		float lado = 2;
		float salidaEsperada = 5;
		Aire c = new Aire() {
			public float areaTrianguloEquilatero(float lado) {
				return 1;
			}

			public float areaCuadrado(float lado) {
				return 1;
			}
		};
		assertTrue(c.areaEstrella(lado) == salidaEsperada);
	}

}

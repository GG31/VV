package paquete;

import static org.junit.Assert.*;

import org.junit.Test;

public class AireTest {

	
	@Test
	public void testCatetoMayorTrianguloRectangulo() {
		float catetoMenor = 1;
		float hipotenusa = 2;
		float result = (float) Math.sqrt(3);
		assertTrue(Aire.catetoMayorTrianguloRectangulo(catetoMenor, hipotenusa) == result);
	}

	@Test
	public void testAreaTrianguloRectangulo() {
		float catetoMenor = 1;
		float catetoMayor = 2;
		float result = 1;
		assertTrue(Aire.areaTrianguloRectangulo(catetoMenor, catetoMayor) == result); 
	}

	@Test
	public void testAreaTrianguloEquilatero() {
		fail("Not yet implemented");
	}

	@Test
	public void testAreaCuadrado() {
		float lado = 2;
		float result = 4;
		assertTrue(Aire.areaCuadrado(lado) == result);
	}

	@Test
	public void testAreaEstrella() {
		fail("Not yet implemented");
	}

}

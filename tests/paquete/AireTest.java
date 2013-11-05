package paquete;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.powermock.api.easymock.PowerMock.*;
import static org.easymock.EasyMock.expect;
//import static org.easymock.internal.ClassExtensionHelper.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockSettings;
import org.mockito.Mockito;
import org.powermock.api.easymock.*;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.easymock.EasyMockSupport;

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

	
	@Test
	public void testCatetoMayorTrianguloRectangulo() {
		float catetoMenor = 1;
		float hipotenusa = 2;
		float salidaEsperada = (float) Math.sqrt(3);
		assertTrue(a.catetoMayorTrianguloRectangulo(catetoMenor, hipotenusa) == salidaEsperada);
	}

	@Test
	public void testAreaTrianguloRectangulo() {
		float catetoMenor = 1;
		float catetoMayor = 2;
		float salidaEsperada = 1;
		assertTrue(a.areaTrianguloRectangulo(catetoMenor, catetoMayor) == salidaEsperada);
	}

	
	@Test
	public void testAreaTrianguloEquilatero() {
		float lado = 2;
		float salidaEsperada = 2;
		
		Aire c = new Aire(){
			public float areaTrianguloRectangulo(float catetoMenor, float catetoMayor){
				return 1;
			}
			public float catetoMayorTrianguloRectangulo(float catetoMenor,
					float hipotenusa){
				return 1;
			}
		};
		assertTrue(c.areaTrianguloEquilatero(lado)==salidaEsperada);
	}

	@Test
	public void testAreaCuadrado() {
		float lado = 2;
		float salidaEsperada = 4;
		assertTrue(a.areaCuadrado(lado) == salidaEsperada);
	}

	@Test
	public void testAreaEstrella() {
		float lado = 2;
		float salidaEsperada = 5;
		Aire c = new Aire(){
			public float areaTrianguloEquilatero(float lado){
				return 1;
			}
			public float areaCuadrado(float lado){
				return 1;
			}
		};
		assertTrue(c.areaEstrella(lado)==salidaEsperada);
	}

}

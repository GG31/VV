package paquete;

public class AireStatic {

	/**
	 * Calcula el cateto mayor a partir de la hipotenusa y del cateto Menor
	 * @param catetoMenor
	 * @param hipotenusa
	 * @return float cateto mayor 
	 */
	public static float catetoMayorTrianguloRectangulo(float catetoMenor,
			float hipotenusa) {
		return (float) Math.sqrt(hipotenusa * hipotenusa - catetoMenor
				* catetoMenor);
	}

	/**
	 * Calcula la área del triangulo rectangulo
	 * @param catetoMenor
	 * @param catetoMayor
	 * @return area
	 */
	public static float areaTrianguloRectangulo(float catetoMenor, float catetoMayor) {
		return (catetoMenor * catetoMayor) / 2;
	}

	/**
	 * Calcula la área del tringulo equilatero
	 * @param lado
	 * @return area
	 */
	public static float areaTrianguloEquilatero(float lado) {
		return  2 * areaTrianguloRectangulo(lado / 2,
				catetoMayorTrianguloRectangulo(lado / 2, lado));
	}

	/**
	 * Calcula el area del cuadrado
	 * @param lado
	 * @return area
	 */
	public static float areaCuadrado(float lado) {
		return lado * lado;
	}

	/**
	 * Calcula la area total de la estrella
	 * @param lado
	 * @return area
	 */
	public static float areaEstrella(float lado) {
		return (4 * areaTrianguloEquilatero(lado) + areaCuadrado(lado));
	}
}

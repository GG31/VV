package paquete;

public class Aire {
	/*#define compAreaEstr 0
	#define compAreaTriEqui 1
	#define compAreaCua 2
	#define compAreaTriRec 3
	#define compCatMayTriRect 4*/

	static float catetoMayorTrianguloRectangulo(float catetoMenor, float hipotenusa)  { 
		return (float) Math.sqrt( hipotenusa*hipotenusa - catetoMenor*catetoMenor ) ;   
	             } 
	       
	static float areaTrianguloRectangulo (float catetoMenor, float catetoMayor) { 
	               return (catetoMenor*catetoMayor) / 2 ;      
	       }

	static float areaTrianguloEquilatero (float lado) {
	              return 2* areaTrianguloRectangulo (lado/2, catetoMayorTrianguloRectangulo (lado/2,lado) ) ;    
	       }

	static float areaCuadrado (float lado) { 
	               return lado*lado;      
	       }       

	static float areaEstrella(float lado) { 
	                return(4* areaTrianguloEquilatero(lado) + areaCuadrado (lado) );
	      }
}

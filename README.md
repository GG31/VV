VV Practica 1 
=============

La meta es hacer la práctica 1 de VV en java con la herramienta JUnit.

En la clase Aire.java podrás encontrar una clase con un constructor vacío y los métodos que hay que probar. 
La clase AireTest corresponde a los tests de la clase Aire.java utilizando clases anónimas para que los métodos llamados por el método que está probando devuelve 1 (stub).

En la clase AireStatic.java podrás encontrar todos los métodos que hay que probar en static, lo que permite no poner constructor.
La clase AireStatic.java prueba todos los métodos de AireStatic.java utilizando mock static partial de la librería PowerMock.
Para que funccione, el sistema necesita 4 librerías  : cglib-nodep-2.2.3.jar, objenesis-tck-2.1.jar, javassist-3.14.0-GA.jar y powermock-easymock-1.5.1-full.jar que podrás encontrar en la carpeta "lib".


Podráis encontrar en el fichero "testingReport.xml", los resultados de los tests. Número ejecutados, número de errores, número de failures, tiempo de ejecución y los errores ocuridas si hay.
Este fichero es generado por el herramienta JUnit.

===================
By Geneviève CIRERA
El 10 de noviembre de 2013
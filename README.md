***TpsJava8Angular8***

**TP1**

_ENUNCIADO_

Realizar un proyecto que cumpla con la siguientes pautas
Clase Persona que tenga los siguientes atributos
nombre , apellido y edad
Funcionalidad
debe garantizar que la persona es mayor de 18 a�os para poder conducir

Clase Auto , que tenga los siguientes atributos
marca , modelo y Persona
Funcionalidad
Si la persona es menor de edad el auto no debe ser capaz de arrancar
Velocidad maxima es de 150km por hora si la persona es menor o igual de 30 a�os y 70 km por si es mayor de 80 a�os

Plus
Por ultimo se requiere que existan 3 personas y 2 autos, pero dos personas no pueden manera el auto, debe verificar que el auto este libre para ocuparse



**TP2**

Lo han contratado para realizar un Sistema para un Gimnasio de Boxeo.
Se desea ingresar en el sistema a los aspirantes a Boxeador que llegan en un d�a.

El gimnasio cuenta con 4 entrenadores, cada uno abarca 2 categor�as: 
1-	Mosca-Gallo
2-	Pluma-Ligero
3-	Welter-Mediano
4-	Mediopesado-Pesado.

Los aspirantes a Boxeadores ser�n fichados y asignados al entrenador correspondiente.
A Cada entrenador se le puede asignar 5 boxeadores como m�ximo, una vez cubierto el cupo del entrenador se rechazaran los siguientes, que corresponder�an a dicho entrenador.

En la ficha del Boxeador se desea guardar: Nombre, Apellido, edad, altura, peso, entrenador asignado y categor�a asignada.

Las categor�as ser�n las 8 t�picas del Boxeo:

Categor�a                    PESO en Kg
                        m�nimo            M�ximo
Mosca 		  48.988 	50.802
Gallo                 52.163 	53.525
Pluma              55.338 	57.152
Ligero                  58.967 	61.237
Welter                 63.503 	66.678
Mediano             69.853 	72.562
Mediopesado  76.205 	79.378
Pesado              91                    Sin L�mite

Los Boxeadores que caen dentro del l�mite de una categor�a, son asignados a ella.
Los que caen fuera de los l�mites ser�n asignados a la categor�a inmediatamente inferior, se espera que el Boxeador pierda peso en el entrenamiento.
S� su peso es menor que la menor categor�a, ser� asignado a la menor categor�a, y se le dar� una dieta de engorde

Al finalizar el d�a se debe imprimir la cantidad de Boxeadores Totales que ingresaron en el d�a y un detalle de la cantidad por Entrenador.


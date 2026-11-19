# APE-6-Arreglos-y-Listas
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)

---
##  Información General

* **Carrera:** Ingeniería en Software  
* **Asignatura:** Algoritmos y Lógica de Programación  
* **Nivel / Parallelo:** Primer Semestre — Paralelo B  
* **Actividad:** APE 6 - Arreglos y listas  
* **Modalidad:** Presencial  
* **Integrantes:** Adrián Andaluz,Ariel Chanatasig, Paulo Escobar, Mateo Salazar

---
## Ejercicio 1: Control de gastos semanales y ajuste por inflación
**Tema:** Arreglos en Java.

### Enunciado
Crea un programa que pida al usuario registrar los gastos diarios de una semana (7 días) en un arreglo de tipo double. Luego, recorre el arreglo para calcular el gasto total y el promedio diario. Finalmente, aplica un aumento del 10 % únicamente a los días en los que el gasto haya superado el promedio, muestra el arreglo actualizado en orden inverso e indica cuántos días sufrieron dicho incremento.

**Indicaciones:**
1. Importar la clase Scanner para leer los datos ingresados por el usuario.
2. Declarar un arreglo de tipo double de tamaño 7 para almacenar los gastos diarios y una variable para acumular el gasto total.
3. Utilizar un bucle for para pedir los gastos de los 7 días y calcular la suma total.
4. Calcular el promedio diario dividiendo el gasto total entre la longitud del arreglo.
5. Recorrer el arreglo con un bucle for para aplicar un incremento del 10 % (`* 1.10`) solo a los elementos mayores al promedio y llevar un contador de los días modificados.
6. Mostrar los elementos del arreglo actualizado en orden inverso (desde el último índice hasta el índice 0) e imprimir la cantidad total de días con incremento.

**Estructuras y elementos sugeridos:**
- `double[]`
- `Scanner`
- Bucle `for`
- Condicional `if`
- `.length`

### Descripción de la resolución
Para resolver este ejercicio, se utiliza un arreglo unidimensional de tipo `double` con 7 posiciones para almacenar los gastos diarios ingresados mediante `Scanner`. A través de un primer bucle `for` se acumula el gasto total y luego se obtiene el promedio diario. Posteriormente, se recorre el arreglo evaluando con una estructura `if` qué días superan dicho promedio para aplicarles el aumento del 10 % y contabilizar cuántos días recibieron el ajuste. Finalmente, se imprime el arreglo actualizado desde el último índice hacia el primero utilizando `.length` y se muestra el total de días incrementados.

### Resolución a mano
<img width="1060" height="1500" alt="image" src="https://github.com/user-attachments/assets/3df8b8fe-640e-4167-8af0-8464f58bd08e" />


### Evidencia de ejecución
<img width="317" height="355" alt="image" src="https://github.com/user-attachments/assets/3f9bfaa5-4574-4977-abf1-ed8a862b1545" />

---

# Ejercicio 2: Filtro y suma condicionada de producción

**Tema:** Arreglos en Java.

## Enunciado

Crea un programa que declare un arreglo de 10 números enteros ingresados por teclado, que representen la cantidad de piezas fabricadas por turno. Luego, recorre el arreglo para calcular la suma de las piezas ubicadas únicamente en los índices pares (0, 2, 4...), contar cuántos turnos produjeron una cantidad impar de piezas que además sea mayor a 15, y finalmente mostrar el promedio general de producción formateado a 2 decimales.

**Indicaciones:**

1. Importar la clase `Scanner` para leer los datos ingresados por el usuario.
2. Declarar un arreglo de tipo `int` de tamaño 10 para almacenar las piezas fabricadas por turno, y variables para la suma de índices pares, el contador y el total.
3. Utilizar un bucle `for` para pedir la producción de los 10 turnos y acumular el total.
4. Dentro del recorrido, sumar el valor solo cuando el índice sea par (`i % 2 == 0`).
5. Dentro del recorrido, contar el turno solo cuando la cantidad sea impar y mayor a 15 (`piezas[i] % 2 != 0 && piezas[i] > 15`).
6. Calcular el promedio general dividiendo el total entre la longitud del arreglo (usando `(double)` para evitar la división entera) y mostrarlo con 2 decimales mediante `printf("%.2f")`.

**Estructuras y elementos sugeridos:**

- `int[]`
- `Scanner`
- Bucle `for`
- Condicional `if`
- Operador módulo `%`
- Operador lógico `&&`
- `.length`
- `printf`

## Descripción de la resolución

Para resolver este ejercicio se utiliza un arreglo unidimensional de tipo `int` con 10 posiciones para almacenar las piezas fabricadas en cada turno, ingresadas mediante `Scanner`. A través de un bucle `for` se lee cada dato y se acumula el total de producción. En el mismo recorrido, una estructura `if` con `i % 2 == 0` evalúa la posición del elemento para sumar únicamente los índices pares, y otra estructura `if` con `piezas[i] % 2 != 0 && piezas[i] > 15` cuenta los turnos con producción impar y mayor a 15. Finalmente, se calcula el promedio general convirtiendo la suma a `double` para conservar los decimales, y se imprime con 2 decimales utilizando `printf` y `.length`.

### Resolución a mano

<img width="1080" height="1014" alt="image" src="https://github.com/user-attachments/assets/48a00433-c5ff-4adc-9a9d-52f577062ed6" />



## Evidencia de ejecución

<img width="959" height="311" alt="Captura de pantalla 2026-11-18 205255" src="https://github.com/user-attachments/assets/4e1812a5-b054-4e64-88ce-4deeccd385a6" />

---

## Ejercicio 3: Análisis de asistencia y rendimiento

###  Enunciado

Solicita al usuario la cantidad n de estudiantes de un curso y crea un arreglo `int[] notas` de tamaño n. Llena el arreglo con notas válidas (entre 0 y 20). Recorre los datos para calcular:

- El promedio general del curso (evitando la división entera).
- La cantidad de estudiantes aprobados (nota ≥ 14) y reprobados.
- Una lista con los números de estudiante (Estudiante 1, Estudiante 2, etc.) cuya nota esté estrictamente por debajo del promedio.

###  Indicaciones

- Solicitar al usuario la cantidad de estudiantes del curso.
- Crear un arreglo de tipo entero (`int[]`) para almacenar las notas.
- Ingresar notas válidas dentro del rango de 0 a 20.
- Calcular el promedio general utilizando división decimal.
- Determinar la cantidad de estudiantes aprobados y reprobados.
- Identificar a los estudiantes que obtuvieron una nota inferior al promedio general.

###  Instrucciones y elementos sugeridos

- Utilizar un arreglo unidimensional de tipo `int[]`.
- Utilizar la clase `Scanner` para ingresar los datos por teclado.
- Emplear estructuras repetitivas `for` para recorrer el arreglo.
- Utilizar estructuras condicionales `if - else` para clasificar las notas.
- Utilizar una variable de tipo `double` para almacenar el promedio.
- Validar que las notas ingresadas estén entre 0 y 20.
- Utilizar contadores para registrar los estudiantes aprobados y reprobados.

###  Descripción de la solución

La solución consiste en desarrollar un programa en Java que permita registrar y analizar las notas de los estudiantes de un curso mediante un arreglo unidimensional.

Primero, el programa solicita la cantidad de estudiantes y crea un arreglo para almacenar sus respectivas notas. Después, mediante un ciclo `for`, solicita las notas de cada estudiante y verifica que se encuentren dentro del rango permitido de 0 a 20.

Una vez registrados los datos, el programa calcula la suma de todas las notas y obtiene el promedio general utilizando una variable de tipo `double`, evitando así la división entera.

Posteriormente, recorre nuevamente el arreglo para identificar a los estudiantes aprobados, considerando una nota mayor o igual a 14, y a los estudiantes reprobados, cuyas notas sean menores a 14.

Finalmente, muestra el promedio general, la cantidad de estudiantes aprobados y reprobados, y los números de los estudiantes cuyas notas se encuentran estrictamente por debajo del promedio.

### Resolución a mano

<img width="1320" height="1311" alt="WhatsApp Image 2026-11-18 at 9 02 05 PM" src="https://github.com/user-attachments/assets/368914c5-061f-4798-bf62-d553e885e236" />

<img width="1116" height="1600" alt="WhatsApp Image 2026-11-18 at 9 02 05 PM (2)" src="https://github.com/user-attachments/assets/92dbb559-016a-4573-b170-cf62afb69883" />

## Evidencia de ejecución

<img width="1299" height="546" alt="WhatsApp Image 2026-11-18 at 9 05 32 PM" src="https://github.com/user-attachments/assets/a6fef48e-4137-410f-b761-c31fa1ee4a79" />

---

---

## Ejercicio 04: Búsqueda y conteo

**Tema:** Arreglos en Java.

### Enunciado

Dado `int[] numeros = {14, 7, 25, 3, 18, 7, 30};` pide un número por teclado y muestra cuántas veces aparece y su primera posición. Si no existe, imprime "No existe" (usa `posicion = -1`).

**Indicaciones:**

1. Importar la clase `Scanner` para leer los datos ingresados por el usuario.
2. Declarar un arreglo de tipo `int` con los valores `{14, 7, 25, 3, 18, 7, 30}`.
3. Solicitar al usuario un número por teclado.
4. Utilizar un bucle `for` para recorrer el arreglo y comparar sus elementos con el número ingresado.
5. Contar cuántas veces aparece el número y guardar su primera posición utilizando `posicion = -1` como valor inicial.
6. Mostrar la cantidad de veces que aparece y su primera posición. Si no se encuentra, imprimir `"No existe"`.

**Estructuras y elementos sugeridos:**

- `int[]`
- `Scanner`
- Bucle `for`
- Condicional `if`
- `contador`
- `posicion`
- `.length`

### Descripción de la resolución

Para resolver este ejercicio, se utiliza un arreglo unidimensional de tipo `int` con siete elementos. Mediante la clase `Scanner`, se solicita al usuario ingresar un número que desea buscar. Luego, se recorre el arreglo con un bucle `for`, comparando cada elemento con el número ingresado. Si existe una coincidencia, se incrementa el contador y se guarda la primera posición encontrada, siempre que la variable `posicion` todavía tenga el valor `-1`. Finalmente, se muestra cuántas veces aparece el número y su primera posición. Si no se encuentra ninguna coincidencia, se imprime `"No existe"`.

### Resolución a mano

<img width="1190" height="1600" alt="image" src="https://github.com/user-attachments/assets/e5e43d22-bcba-441f-be4d-d21549c4131e" />


### Evidencia de ejecución

<img width="1212" height="366" alt="image" src="https://github.com/user-attachments/assets/95b5ba1e-13b3-4108-8c58-fb23ff927050" />


---

# Ejercicio 5: Máximo y mínimo con arreglos paralelos

## Enunciado

Dados los arreglos `String[] nombres = {"Ana", "Luis", "Marta", "Pedro"};` e `int[] notas = {15, 8, 18, 11};`, mostrar el **nombre y la nota más alta**, el **nombre y la nota más baja** (usando `posMax` y `posMin`) y el **promedio con 2 decimales**.

## Indicaciones

- Desarrollar el ejercicio utilizando el lenguaje de programación Java.
- Utilizar dos arreglos paralelos: uno de nombres y otro de notas.
- Guardar la posición de la nota más alta en `posMax` y la de la más baja en `posMin`.
- Usar esas posiciones para obtener el nombre y la nota correspondientes.
- Calcular el promedio de las notas.
- Mostrar el promedio con 2 decimales.

## Instrucciones y elementos sugeridos

**Elementos utilizados:**

- Arreglos de tipo `String` (`String[]`).
- Arreglos de tipo entero (`int[]`).
- Arreglos paralelos (misma posición, mismo estudiante).
- Bucle `for`.
- Condicional `if`.
- Propiedad `.length`.
- Conversión `(double)`.
- Método `printf()` con formato `%.2f`.

**Instrucciones:**

1. Declarar el arreglo `nombres` con los valores "Ana", "Luis", "Marta" y "Pedro".
2. Declarar el arreglo `notas` con los valores 15, 8, 18 y 11.
3. Declarar las variables `posMax`, `posMin` y `suma`, inicializadas en 0.
4. Recorrer el arreglo `notas` con un bucle `for`.
5. Dentro del recorrido, comparar cada nota con `notas[posMax]` y `notas[posMin]` para actualizar las posiciones.
6. Acumular cada nota en la variable `suma`.
7. Calcular el promedio dividiendo `suma` entre `notas.length`, convirtiendo antes a `double`.
8. Mostrar el nombre y la nota más alta, el nombre y la nota más baja, y el promedio con 2 decimales.

## Descripción de la solución

Para resolver este ejercicio se utilizaron dos arreglos paralelos: `nombres` y `notas`. Son paralelos porque la posición `i` de ambos arreglos corresponde a la misma persona, de modo que si se conoce la posición de una nota también se conoce el nombre asociado.

Primero se declararon `posMax` y `posMin` en 0, asumiendo que el primer elemento es al mismo tiempo el mayor y el menor. Luego, con un bucle `for`, se recorrió el arreglo `notas`: si la nota actual es mayor que `notas[posMax]`, se actualiza `posMax`; si es menor que `notas[posMin]`, se actualiza `posMin`. En el mismo recorrido se fue acumulando la suma de las notas.

Finalmente, se calculó el promedio convirtiendo la suma a `double` para evitar la división entera, y se mostraron los resultados usando `posMax` y `posMin` como índices en ambos arreglos. La nota más alta es 18 (Marta), la más baja es 8 (Luis) y el promedio es 13,00. El promedio se imprimió con 2 decimales mediante `printf` y el formato `%.2f`.

## Resolución a mano

<img width="1080" height="957" alt="image" src="https://github.com/user-attachments/assets/d2bb8701-8d18-4668-af92-c217506d1184" />


## Evidencia de ejecución

<img width="807" height="243" alt="image" src="https://github.com/user-attachments/assets/09f58111-6ddf-483e-9ec3-49587e9adf6b" />


---

## Ejercicio 6: Integrador con java.util.Arrays

###  Enunciado

Dado el arreglo `int[] datos = {14, 7, 25, 3, 18};`, crear una copia real con `Arrays.copyOf`, ordenar solamente la copia con `Arrays.sort` y mostrar ambos arreglos con `Arrays.toString`. Luego indicar el segundo número mayor y la posición del número 14 en la copia con `Arrays.binarySearch`.

###  Indicaciones

- Desarrollar el ejercicio utilizando el lenguaje de programación Java.
- Utilizar la biblioteca `java.util.Arrays`.
- Crear una copia real del arreglo original.
- Ordenar solamente la copia del arreglo.
- Mostrar ambos arreglos en pantalla.
- Identificar el segundo número mayor.
- Buscar la posición del número 14 en la copia.

###  Instrucciones y elementos sugeridos

**Elementos utilizados:**

- Arreglos de tipo entero (`int[]`).
- Biblioteca `java.util.Arrays`.
- Método `Arrays.copyOf()`.
- Método `Arrays.sort()`.
- Método `Arrays.toString()`.
- Método `Arrays.binarySearch()`.

**Instrucciones:**

1. Declarar el arreglo original con los valores 14, 7, 25, 3 y 18.
2. Crear una copia real utilizando `Arrays.copyOf()`.
3. Ordenar la copia utilizando `Arrays.sort()`.
4. Mostrar el arreglo original y la copia ordenada.
5. Obtener el segundo número mayor.
6. Buscar la posición del número 14 utilizando `Arrays.binarySearch()`.
7. Mostrar todos los resultados en pantalla.

###  Descripción de la solución

Para resolver este ejercicio se utilizó la biblioteca `java.util.Arrays`, que permite trabajar con arreglos mediante diferentes métodos.

Primero se declaró un arreglo de números enteros y se creó una copia independiente utilizando `Arrays.copyOf()`. Después se ordenó únicamente la copia mediante `Arrays.sort()`, manteniendo intacto el arreglo original.

Posteriormente, se mostraron ambos arreglos utilizando `Arrays.toString()`. Finalmente, se obtuvo el segundo número mayor, que es 18, y se buscó la posición del número 14 mediante `Arrays.binarySearch()`, obteniendo como resultado la posición 2 (índice basado en cero).

### Resolución a mano

<img width="1074" height="1408" alt="WhatsApp Image 2026-11-19 at 2 34 23 PM" src="https://github.com/user-attachments/assets/3a97cf33-5163-4c9a-ac91-fb520aecd177" />

### Evidencia de ejecución

<img width="896" height="185" alt="WhatsApp Image 2026-11-19 at 3 16 00 PM" src="https://github.com/user-attachments/assets/b9c05bf5-2c93-4aaa-9c7a-4ae393f18f6d" />


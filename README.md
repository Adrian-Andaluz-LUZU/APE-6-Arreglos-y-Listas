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

## Resolución a mano

<img width="1080" height="1014" alt="image" src="https://github.com/user-attachments/assets/48a00433-c5ff-4adc-9a9d-52f577062ed6" />



## Evidencia de ejecución

<img width="959" height="311" alt="Captura de pantalla 2026-11-18 205255" src="https://github.com/user-attachments/assets/4e1812a5-b054-4e64-88ce-4deeccd385a6" />

```

Tema: Arreglos en Java.

# Enunciado

Solicitar al usuario la cantidad n de estudiantes de un curso y crear un arreglo de tipo int[] de tamaño n. Llenar el arreglo con notas válidas (entre 0 y 20). Recorrer los datos para calcular:

- El promedio general del curso (evitando la división entera).
- La cantidad de estudiantes aprobados (nota >= 14) y reprobados.
- Una lista con los números de estudiante (Estudiante 1, Estudiante 2, etc.) cuya nota esté estrictamente por debajo del promedio.

**Indicaciones:**

1. Solicitar al usuario la cantidad de estudiantes.
2. Crear un arreglo de tipo entero para almacenar las calificaciones.
3. Ingresar las notas de cada estudiante.
4. Validar que las notas estén dentro del rango de 0 a 20.
5. Recorrer el arreglo para calcular la suma total de las notas.
6. Calcular el promedio general evitando la división entera.
7. Contar los estudiantes aprobados y reprobados.
8. Mostrar los números de los estudiantes cuyas notas estén por debajo del promedio.

**Estructuras y elementos sugeridos**

- `Scanner`: Para ingresar los datos por teclado.
- `int[]`: Para almacenar las calificaciones.
- `for`: Para recorrer el arreglo.
- `while`: Para validar las notas ingresadas.
- `if - else`: Para clasificar a los estudiantes.
- `double`: Para calcular el promedio con decimales.

**Descripción de la solución**

Se desarrolló un programa en Java que permite analizar el rendimiento académico de un grupo de estudiantes mediante arreglos.

Primero, se solicita la cantidad de estudiantes y se crea un arreglo de tipo entero para almacenar sus calificaciones. Después, se ingresan las notas y se valida que estén entre 0 y 20.

Mediante un ciclo for se recorren las calificaciones para calcular la suma total. Posteriormente, se calcula el promedio general utilizando una variable double para evitar la división entera.

Luego, mediante condicionales if-else, se determina la cantidad de estudiantes aprobados y reprobados, considerando como nota mínima de aprobación 14.

Finalmente, se comparan las calificaciones con el promedio general para mostrar los números de los estudiantes que tienen notas inferiores al promedio.

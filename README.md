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

# Ejercicio 3: Asistencia y rendimiento

## . Enunciado

Solicitar al usuario la cantidad de estudiantes de un curso y crear un arreglo de tipo `int[]` de tamaño n. Llenar el arreglo con notas válidas (entre 0 y 20). Recorrer los datos para calcular:

- El promedio general del curso, evitando la división entera.
- La cantidad de estudiantes aprobados (nota >= 14) y reprobados.
- Una lista con los números de estudiante cuya nota esté estrictamente por debajo del promedio.

## . Indicaciones

1. Solicitar la cantidad de estudiantes del curso.
2. Crear un arreglo para almacenar las calificaciones.
3. Ingresar las notas de cada estudiante, validando que estén entre 0 y 20.
4. Calcular la suma total de las calificaciones.
5. Calcular el promedio general con decimales.
6. Contar los estudiantes aprobados y reprobados.
7. Mostrar los estudiantes que tienen una nota inferior al promedio.

## . Estructuras y elementos sugeridos

- `Scanner`: permite ingresar datos por teclado.
- `int[]`: permite almacenar las calificaciones.
- `for`: permite recorrer el arreglo.
- `while`: permite validar los datos ingresados.
- `if - else`: permite clasificar a los estudiantes.
- `double`: permite calcular el promedio con decimales.
- `boolean`: permite comprobar si existen estudiantes debajo del promedio.

## . Descripción de la solución

Se desarrolló un programa en Java utilizando arreglos para almacenar las calificaciones de los estudiantes.

Primero, se solicita la cantidad de estudiantes y se crea un arreglo de tipo entero. Luego, se ingresan las notas de cada estudiante, comprobando que los valores estén entre 0 y 20.

Mediante un ciclo `for`, se recorre el arreglo para sumar todas las calificaciones. Después, se calcula el promedio general utilizando `double` para evitar la división entera.

Posteriormente, mediante condicionales `if - else`, se cuentan los estudiantes aprobados, con notas mayores o iguales a 14, y los reprobados, con notas inferiores a 14.

Finalmente, se comparan las calificaciones con el promedio general para identificar y mostrar los números de los estudiantes que se encuentran por debajo de este.

### Resultado

El programa muestra:

- Promedio general del curso.
- Cantidad de estudiantes aprobados.
- Cantidad de estudiantes reprobados.
- Lista de estudiantes con notas inferiores al promedio.

## Resolución a mano

<img width="1320" height="1311" alt="WhatsApp Image 2026-11-18 at 9 02 05 PM" src="https://github.com/user-attachments/assets/d183e4d9-6ce5-4096-849e-6c91b4cd17f3" />

<img width="1116" height="1600" alt="WhatsApp Image 2026-11-18 at 9 02 05 PM (2)" src="https://github.com/user-attachments/assets/f6a8d1dd-9afb-4540-b7b2-3b84c8240312" />

## Evidencia de ejecución

<img width="1299" height="546" alt="WhatsApp Image 2026-11-18 at 9 05 32 PM" src="https://github.com/user-attachments/assets/c5b76d94-dd4c-4476-8c83-beb3e4feaacf" />





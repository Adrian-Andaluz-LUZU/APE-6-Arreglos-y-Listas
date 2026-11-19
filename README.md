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


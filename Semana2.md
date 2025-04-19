# 🧠 Apuntes – Eficiencia de Algoritmos  
## Tema: Ordenamiento de Arreglos y Análisis de Casos

---

## 📌 ¿Qué es la eficiencia de un algoritmo?

- Es una **medida de qué tan rápido** (tiempo) y/o **qué tantos recursos** (memoria, etc.) usa un algoritmo para resolver un problema.
- En análisis de algoritmos, normalmente medimos la **complejidad temporal** usando notación asintótica (`O(n)`, `O(n²)`, etc).

---

## 🔍 ¿Por qué importa esto en ordenamientos?

Cuando tenemos un **arreglo desordenado** (ej. números, palabras, objetos), muchas veces queremos ordenarlo (de menor a mayor, alfabéticamente, etc.).  
El **algoritmo de ordenamiento** que elijamos puede hacer una gran diferencia si el arreglo es muy grande.

---

## 🔢 Ejemplos de algoritmos de ordenamiento (con análisis en lenguaje natural)

---

### 1. **Bubble Sort (Burbuja)**

- **Cómo funciona:** Compara elementos vecinos y los intercambia si están en el orden incorrecto. Se repite hasta que todo esté ordenado.
- **Ejemplo:** `[5, 3, 1]` → se compara 5 y 3 → se intercambian → `[3, 5, 1]` → sigue...
- **Eficiencia:**
  - Peor caso: `O(n²)`
  - Mejor caso: `O(n)` (si está optimizado)
- **Comentario:** Muy intuitivo pero **poco eficiente** para arreglos grandes.

---

### 2. **Selection Sort (Selección)**

- **Cómo funciona:** Busca el valor más pequeño y lo pone al inicio. Repite con el resto.
- **Ejemplo:** `[4, 2, 5, 1]` → encuentra el 1 y lo pone al inicio → `[1, 2, 5, 4]` → sigue...
- **Eficiencia:**
  - Siempre `O(n²)` comparaciones.
- **Comentario:** Hace **menos intercambios**, pero no mejora con arreglos parcialmente ordenados.

---

### 3. **Insertion Sort (Inserción)**

- **Cómo funciona:** Inserta cada elemento en el lugar correcto respecto a los anteriores.
- **Ejemplo:** `[3, 1, 4]` → inserta 1 antes de 3 → `[1, 3, 4]`
- **Eficiencia:**
  - Peor caso: `O(n²)`
  - Mejor caso: `O(n)`
- **Comentario:** Muy eficiente para **arreglos pequeños o casi ordenados**.

---

### 4. **Merge Sort (Mezcla)**

- **Cómo funciona:** Divide el arreglo en mitades recursivamente, ordena cada mitad, y las fusiona.
- **Ejemplo:** `[8, 3, 5, 1]` → divide → ordena → combina → `[1, 3, 5, 8]`
- **Eficiencia:** Siempre `O(n log n)`
- **Comentario:** Muy eficiente y **estable**, pero usa memoria adicional.

---

### 5. **Quick Sort (Rápido)**

- **Cómo funciona:** Elige un pivote, separa menores y mayores, y aplica recursivamente.
- **Ejemplo:** `[5, 3, 8, 1]` con pivote 5 → separamos → ordenamos cada parte → combinamos.
- **Eficiencia:**
  - Promedio: `O(n log n)`
  - Peor caso: `O(n²)` (pivotes malos)
- **Comentario:** Muy rápido en la práctica, aunque **no es estable**.

---

## ⚖️ Comparación rápida

| Algoritmo     | Mejor caso | Promedio     | Peor caso   | Estable | Recomendado para                   |
|---------------|------------|--------------|-------------|---------|------------------------------------|
| Bubble Sort   | O(n)       | O(n²)        | O(n²)       | ✅      | Muy básicos, con fines educativos  |
| Selection Sort| O(n²)      | O(n²)        | O(n²)       | ❌      | Entender comparaciones/intercambios|
| Insertion Sort| O(n)       | O(n²)        | O(n²)       | ✅      | Arreglos pequeños o casi ordenados |
| Merge Sort    | O(n log n) | O(n log n)   | O(n log n)  | ✅      | Grandes volúmenes, se requiere estabilidad |
| Quick Sort    | O(n log n) | O(n log n)   | O(n²)       | ❌      | Muy rápido, ideal en la práctica   |

---

## 🧠 Conclusión

- No hay un único algoritmo "mejor". La elección depende de:
  - El tamaño del arreglo.
  - Qué tan desordenado está.
  - Si necesitas que el ordenamiento sea **estable**.
- Para arreglos pequeños o casi ordenados: `Insertion Sort`.
- Para arreglos grandes: `Merge Sort` (si necesitas estabilidad) o `Quick Sort` (más rápido en la práctica).

---

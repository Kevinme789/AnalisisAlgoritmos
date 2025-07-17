# Mediana: Concepto y Cálculo

La **mediana** es un indicador estadístico que señala el valor central de un conjunto de datos ordenados. Representa una medida de tendencia central resistente a valores atípicos.

- Si el número de datos (`n`) es impar, la mediana es el valor ubicado exactamente a la mitad.
- Si `n` es par, se calcula como el promedio de los dos valores que quedan en el centro, o se puede tomar uno de ellos en función del caso.

---

## Procedimiento para determinar la mediana

1. Organizar los datos de forma ascendente.
2. Identificar el valor medio:
   - Si `n` es impar → mediana = dato en la posición `(n + 1) / 2`.
   - Si `n` es par → mediana = promedio de los datos en las posiciones `n / 2` y `(n / 2) + 1`.

Este proceso es directo, pero cuando se trabaja con grandes cantidades de datos puede implicar un costo computacional elevado debido al ordenamiento.

---

## Importancia de la mediana en algoritmos

Más allá del ámbito estadístico, la mediana tiene aplicaciones relevantes en ciencias de la computación:

- Permite dividir estructuras de datos en partes equitativas.
- Es utilizada como referencia en problemas de búsqueda o partición.
- Se emplea en métodos como Quickselect o Quicksort para seleccionar pivotes eficaces que reduzcan el número de comparaciones.

---

## Algoritmos que evitan ordenar completamente

En problemas con restricciones de eficiencia, se pueden aplicar técnicas basadas en el enfoque de _divide y vencerás_ para hallar la mediana en tiempo lineal promedio, evitando ordenar todo el conjunto.  
Estas estrategias utilizan particionamiento recursivo y selección de subconjuntos para reducir el problema progresivamente.

---

# Multiplicación de Matrices: Fundamentos

La multiplicación de matrices es una operación algebraica esencial en áreas como el análisis numérico, gráficos computacionales y sistemas lineales.

El producto entre dos matrices genera una nueva matriz cuyas dimensiones dependen de las matrices de entrada, y su contenido resulta de multiplicaciones entre filas y columnas.

---

## Condiciones para multiplicar matrices

Para que sea posible multiplicar dos matrices:

- La primera matriz `A` debe tener dimensión `m × n`.
- La segunda matriz `B` debe tener dimensión `n × p`.
- El producto `A × B` genera una matriz `C` de dimensión `m × p`.

El cálculo de cada elemento de la matriz resultante se define así:

C[i][j] = A[i][1]·B[1][j] + A[i][2]·B[2][j] + ... + A[i][n]·B[n][j]

Este resultado se obtiene al multiplicar la fila `i` de la matriz `A` con la columna `j` de la matriz `B`.

---

## Ejemplo con matrices 2x2

Dadas las siguientes matrices:

A = | a11 a12 |
| a21 a22 |

B = | b11 b12 |
| b21 b22 |

El producto `C = A × B` da como resultado:
C[1][1] = a11·b11 + a12·b21
C[1][2] = a11·b12 + a12·b22
C[2][1] = a21·b11 + a22·b21
C[2][2] = a21·b12 + a22·b22

Este mismo procedimiento se aplica a matrices de mayor tamaño, siempre que cumplan con las dimensiones requeridas.

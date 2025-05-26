# Semana 6

## Estructuras de Control

#### Estructura de control interativa: Bucles (para)

- Repite un bloque de instrucciones un número determinado de veces
- Se utiliza cuando se conoce de antemano cuántas veces debe repetirse el ciclo

#### LLamadas recursivas - ¿Qué es la recursión?

- Técnica en la cual una función se llama a sí misma para resolver un problema.

### Ejemplo

#### Enunciado

**Obtenga el T(n) del siguiente algoritmo.**

##### Algoritmo

```pascal
Procedure misterio(n: integer)
Var
   contador, i, j, k: integer
Begin
   contador := 0
   for i := 1 to n - 1 do
      for j := i + 1 to n do
         for k := 1 to j do
            contador := contador + 1
End
```

#### Prueba de escritorio

Para n = 4

| Valor de i | Valor de j | Valores de k | Iteraciones del contador |
| ---------- | ---------- | ------------ | ------------------------ |
| 1          | 2          | 1, 2         | 2                        |
| 1          | 3          | 1, 2, 3      | 3                        |
| 1          | 4          | 1, 2, 3, 4   | 4                        |
| 2          | 3          | 1, 2, 3      | 3                        |
| 2          | 4          | 1, 2, 3, 4   | 4                        |
| 3          | 4          | 1, 2, 3, 4   | 4                        |

**Total = 20**

---

#### Análisis

\[
T(n) = \sum*{i=1}^{n-1} \sum*{j=i+1}^{n} \sum\_{k=1}^{j} 1
\]

\[
T(n) = \sum*{i=1}^{n-1} \sum*{j=i+1}^{n} j
\]

\[
T(n) = \sum*{j=2}^{n} \sum*{i=1}^{j-1} j = \sum*{j=2}^{n} (j - 1) \cdot j = \sum*{j=2}^{n} (j^2 - j)
\]

\[
T(n) = \sum*{j=2}^{n} j^2 - \sum*{j=2}^{n} j
\]

Sabemos que:

\[
\sum*{j=1}^{n} j^2 = \frac{n(n+1)(2n+1)}{6}, \quad \sum*{j=1}^{n} j = \frac{n(n+1)}{2}
\]

Por tanto:

\[
T(n) = \frac{n(n+1)(2n+1)}{6} - 1 - \left( \frac{n(n+1)}{2} - 1 \right)
\]

\[
T(n) = \frac{n(n+1)(2n+1)}{6} - \frac{n(n+1)}{2}
\]

\[
T(n) = \frac{n(n+1)}{6}[(2n+1) - 3] = \frac{n(n+1)(2n - 2)}{6} = \frac{n(n+1)(n-1)}{3}
\]

#### Verificación para n = 4

\[
T(4) = \frac{4 \cdot 5 \cdot 3}{3} = \frac{60}{3} = 20 \quad \text{✔️ Se cumple}
\]

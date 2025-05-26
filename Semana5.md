# Análisis de Funciones y Notación Asintótica

- **Función Analizada:**  
  \( f(h) = n^3 + 9n^2 \log (h) \)
- **Campaña:**  
  \( f(n) \in D(g(n)) \)  
  \( f(n) \in O(h^2) \)

---

## Ejercicio 1

**Funciones:**  
\( j(n) = n^3 + 9n^2 \log(n) \)  
\( g(n) = n^2 \log(n) \)

### Límite para Comparar \( j(n) \) y \( g(n) \)

\[
\lim*{{n \to \infty}} \frac{j(n)}{g(n)} = \lim*{{n \to \infty}} \frac{n^3 + 9n^2 \log(n)}{n^2 \log(n)} = \lim\_{{n \to \infty}} \left( \frac{n}{\log(n)} + 9 \right) = \infty
\]  
**Conclusión:**  
\( j(n) \notin O(g(n)) \), ya que el límite tiende a infinito.

### Derivadas de las Funciones

\[
\frac{d}{dn} [n^3 + 9n^2 \log(n)] = 3n^2 + 18n \log(n) + 9n
\]  
\[
\frac{d}{dn} [n^2 \log(n)] = 2n \log(n) + n
\]

### Límite de las Derivadas

\[
\lim*{{n \to \infty}} \frac{3n^2 + 18n \log(n) + 9n}{2n \log(n) + n} = \lim*{{n \to \infty}} \frac{3n + 18 \log(n) + 9}{2 \log(n) + 1} \to \infty
\]  
**Observación:**  
El término \( \frac{9n^2 \log(n)}{n^2 \log(n)} = 9 \) es incorrecto en el contexto del límite.

---

## Ejercicio 2

**Funciones:**  
\( f(n) = 2^n \)  
\( g(n) = 2^{2n} \)

### Relación entre \( f(n) \) y \( O(g(n)) \)

\[
\lim*{{n \to \infty}} \frac{f(n)}{g(n)} = \lim*{{n \to \infty}} \frac{2^n}{2^{2n}} = \lim\_{{n \to \infty}} \frac{1}{2^n} = 0
\]  
**Conclusión:**  
\( f(n) \in O(g(n)) \), ya que el límite es 0.

### Relación Inversa

\[
\frac{g(n)}{f(n)} = \frac{2^{2n}}{2^n} = 2^n \to \infty
\]  
**Conclusión:**  
\( g(n) \notin O(f(n)) \), porque \( g(n) \) crece mucho más rápido que \( f(n) \).

---

## Observaciones Adicionales

- En la primera imagen, hay errores tipográficos como "b" en lugar de "n" y "q" en lugar de "9".
- La notación \( D(g(n)) \) no es estándar; posiblemente se refiera a \( \Omega(g(n)) \).
- El término "b-lario" y "cree mes rupture" no son claros; podrían ser errores de transcripción.

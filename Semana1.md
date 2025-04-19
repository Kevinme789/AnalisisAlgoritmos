## Tema: 1. Algoritmia Elemental

---

## 1.1 Preliminares

---

### 🧮 1.1.1 Notación

- Se usa notación **asintótica** para describir el comportamiento de los algoritmos cuando el tamaño de la entrada crece mucho (n → ∞).
- Ignoramos constantes y detalles pequeños → nos enfocamos en el orden de crecimiento.

**Notaciones principales:**

- **O(grande)**: cota superior. Mide el *peor caso*.
  - Ejemplo: Si un algoritmo tarda 3n + 5 pasos → O(n)
- **Ω(grande)**: cota inferior. El *mejor caso*.
- **Θ(grande)**: cota ajustada. Cuando el peor y mejor caso coinciden.
  - Ej: O(n) y Ω(n) → entonces Θ(n)

📝 *Nota:* También existen notaciones como `o` (menor estricto) y `ω` (mayor estricto), menos comunes en el curso básico.

---

### 🔁 1.1.2 Contradicción (Prueba por contradicción)

- Técnica lógica para demostrar que una afirmación es verdadera.
- Supongo lo contrario (que es falsa) → llego a una contradicción lógica → entonces debe ser verdadera.

**Ejemplo clásico:**  
Probar que √2 es irracional:
1. Supongo que √2 = a/b (fracción irreducible).
2. Al elevar al cuadrado y despejar → llego a que a y b son pares → contradicción.

**En algoritmos se usa para:**
- Probar imposibilidades.
- Confirmar propiedades lógicas indirectamente.

---

### 🔁 1.1.3 Inducción matemática

- Método para demostrar afirmaciones para todos los **números naturales**.

**Pasos:**
1. **Caso base:** se comprueba para n=1.
2. **Paso inductivo:** se asume cierto para n=k y se demuestra para n=k+1.

**Ejemplo:**
Probar que la suma de los primeros `n` naturales es `n(n+1)/2`

- Base: n = 1 → 1 = 1(1+1)/2 ✅
- Paso inductivo: Suponemos para n = k → se demuestra para k+1.

**Aplicación en algoritmos:**
- Verificar correctitud de algoritmos recursivos.
- Probar fórmulas de complejidad.
- Mostrar que un algoritmo siempre termina.

---

### 🧩 1.1.4 Problemas

- Un **problema computacional** es una tarea abstracta que se busca resolver mediante un algoritmo.

**Componentes:**
- **Entrada:** lo que recibe el algoritmo.
- **Salida:** lo que debe devolver si está bien resuelto.

**Tipos de problemas:**

1. **Decisión**: respuesta sí/no.  
   - Ej: ¿Hay un camino entre A y B?

2. **Optimización**: buscar la mejor solución.  
   - Ej: ¿Cuál es el camino más corto?

3. **Conteo**: cuántas soluciones existen.  
   - Ej: ¿Cuántas combinaciones posibles hay?

4. **Difíciles (NP / NP-completos)**  
   - Problemas para los que no se conoce solución eficiente.
   - Ej: Viajante (TSP), 3-SAT, etc.

**Qué debe tener un buen algoritmo:**
- **Correctitud:** siempre debe dar la salida correcta.
- **Eficiencia:** hacerlo rápido y con pocos recursos.
- **Generalidad:** funcionar para cualquier entrada válida.

---

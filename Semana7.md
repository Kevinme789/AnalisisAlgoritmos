## Taller

### Codificar el algoritmo de Fibonacci

```java
package analisisalgoritmosfibonaci;

import java.util.Scanner;

public class AnalisisAlgoritmosFibonaci {

public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Cuantos terminos de la serie Fibonacci deseas mostrar? ");
        int cantidad = scan.nextInt();

        System.out.println("Serie de Fibonacci con " + cantidad + " terminos:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }
}
```

Cada llamada a `fibonacci(n)` genera dos llamadas recursivas cuando `n > 1`. Esta recurrencia refleja que el tiempo de ejecución sigue la misma estructura que la sucesión de Fibonacci.

---

## ⏱ 2. Complejidad temporal estimada

Por observación y análisis, sabemos que el número de llamadas crece exponencialmente. Por lo tanto:

---

## 🧠 3. Demostración por inducción

### ✅ Base de la inducción

- T(0) ≤ C·2⁰ → se cumple si C ≥ 1
- T(1) ≤ C·2¹ → se cumple si C ≥ 1

### ✅ Hipótesis inductiva

Supongamos que para todo `k < n`:

```math
T(k) ≤ C·2^k
```

### ✅ Paso inductivo

Queremos probar que:

```math
T(n) = T(n-1) + T(n-2)
```

```math
≤ C·2^(n-1) + C·2^(n-2)
```

```math
= C·2^(n-2)·(2 + 1)
```

```math
= 3C·2^(n-2)
```

Ahora probamos que esta expresión es menor o igual a D·2ⁿ para alguna constante D:

```math
3C·2^(n-2) = (3/4)·C·2^n
```

```math
⇒ T(n) ≤ (3/4)·C·2^n
```

```math
⇒ T(n) ∈ O(2^n)
```

---

## 📉 4. Cota inferior (Ω)

Sabemos que la sucesión de Fibonacci también cumple:

```math
f(n) ≥ φ^(n-2), donde  φ ≈ 1.618
```

```math
⇒ T(n) ≥ d·φ^n, para alguna constante d > 0
```

```math
⇒ T(n) ∈ Ω(2^{0.5n})
```

---

## ✅ Conclusión final

El crecimiento del algoritmo está acotado inferior y superiormente por funciones exponenciales:

```math
T(n) ∈ Θ(2^n)
```

Esto demuestra que el algoritmo recursivo es **altamente ineficiente** para valores grandes de `n`.

# Algoritmos Aleatorios: Fundamentos y Aplicaciones

## Tiempo Esperado en Algoritmos Probabilísticos

En ciertos algoritmos, el uso de decisiones aleatorias introduce variaciones en el tiempo de ejecución, incluso si se proporciona la misma entrada en cada ejecución. Por esta razón, en lugar de calcular un promedio sobre múltiples entradas diferentes, se utiliza el concepto de **tiempo esperado**, que refleja el comportamiento promedio del algoritmo sobre múltiples ejecuciones con una única entrada.

---

## Comparación entre Promedio y Tiempo Esperado

| Criterio                 | Promedio Clásico                   | Tiempo Esperado                                        |
| ------------------------ | ---------------------------------- | ------------------------------------------------------ |
| Tipo de algoritmo        | Determinista                       | Aleatorizado                                           |
| Fuente de variación      | Diversidad en los datos de entrada | Comportamiento interno del algoritmo                   |
| Método de evaluación     | Promedio sobre múltiples entradas  | Promedio sobre varias ejecuciones con la misma entrada |
| Control sobre la entrada | Cambia en cada prueba              | Se mantiene constante                                  |
| Propósito del análisis   | Evaluar rendimiento global         | Medir influencia del azar en la ejecución              |

---

## Ejemplo Conceptual

Considere un algoritmo que, en una situación incierta, puede tomar una decisión rápida con cierto costo o esperar por una alternativa gratuita pero más lenta.  
El tiempo esperado nos permite estimar cuál sería el rendimiento promedio al tomar decisiones al azar en ese escenario.

---

## Números Aleatorios y Pseudoaleatoriedad

Muchos algoritmos utilizan números aleatorios para seleccionar elementos, establecer pivotes, modelar incertidumbre o realizar simulaciones.

Los **números pseudoaleatorios** son generados mediante fórmulas deterministas, pero distribuidos de forma que se asemejan a una verdadera secuencia aleatoria. Aunque no son impredecibles, son suficientemente variados para su uso práctico.

---

## Generador Congruencial Lineal

Este es un método clásico para generar secuencias pseudoaleatorias. Se basa en una fórmula recursiva:

Xₙ₊₁ = (a \* Xₙ + c) mod m

Donde:

- `Xₙ` es el número anterior (o semilla inicial),
- `a`, `c` y `m` son constantes predefinidas que determinan las propiedades del generador.

Este tipo de generador es eficiente y fácil de implementar, aunque presenta limitaciones en aplicaciones que requieren mayor aleatoriedad.

---

## Ejemplo de Implementación en Java

```java
public class CongruencialLineal {

    private static final long multiplicador = 1664525;
    private static final long incremento = 1013904223;
    private static final long modulo = (long) Math.pow(2, 32);
    private long estadoActual;

    public CongruencialLineal(long semillaInicial) {
        this.estadoActual = semillaInicial;
    }

    public double generarNumero() {
        estadoActual = (multiplicador * estadoActual + incremento) % modulo;
        return (double) estadoActual / modulo;
    }

    public static void main(String[] args) {
        CongruencialLineal generador = new CongruencialLineal(123456789);

        System.out.println("Primeros 10 números generados:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Número[%d] = %.10f%n", i + 1, generador.generarNumero());
        }
    }
}

```

![alt text](image.png)

## Distribución de Valores Pseudoaleatorios

Es importante verificar si los valores generados tienen una distribución adecuada. A continuación, se muestra una implementación alternativa que cuenta la frecuencia de números pseudoaleatorios en diferentes intervalos:

```java
public class EvaluadorDistribucion {

    private static final long factor = 1103515245;
    private static final long incrementoConstante = 12345;
    private static final long moduloMaximo = (long) Math.pow(2, 31);

    private long estadoActual;

    public EvaluadorDistribucion(long semillaInicial) {
        this.estadoActual = semillaInicial;
    }

    public double generarValor() {
        estadoActual = (factor * estadoActual + incrementoConstante) % moduloMaximo;
        return (double) estadoActual / moduloMaximo;
    }

    public static void main(String[] args) {
        EvaluadorDistribucion generador = new EvaluadorDistribucion(987654321L);
        int[] contadorIntervalos = new int[5];

        for (int i = 0; i < 100; i++) {
            double numeroGenerado = generador.generarValor();
            if (numeroGenerado < 0.2) contadorIntervalos[0]++;
            else if (numeroGenerado < 0.4) contadorIntervalos[1]++;
            else if (numeroGenerado < 0.6) contadorIntervalos[2]++;
            else if (numeroGenerado < 0.8) contadorIntervalos[3]++;
            else contadorIntervalos[4]++;
        }

        System.out.println("Conteo de números por intervalo:");
        for (int i = 0; i < contadorIntervalos.length; i++) {
            System.out.printf("Intervalo [%.1f, %.1f): %d%n", i * 0.2, (i + 1) * 0.2, contadorIntervalos[i]);
        }
    }
}
```

![alt text](image-1.png)

# Semana 11 Analisis de Algoritmos

# Paradigma Divide y Vencerás y Algoritmos de Búsqueda

## Concepto General

El paradigma conocido como **Divide y Vencerás** permite resolver problemas complejos dividiéndolos en partes más pequeñas. Cada subproblema se resuelve de forma individual y posteriormente se combinan los resultados. Esta técnica es clave en algoritmos como la búsqueda binaria y la multiplicación optimizada.

## Aplicación Matemática

Tomemos el siguiente ejemplo de multiplicación:

```
981 × 1234 = (100a + b)(100c + d)
           = 10000ac + 100(ad + bc) + bd
```

Usando productos auxiliares se reduce el número de operaciones, lo cual es aprovechado por métodos como **Karatsuba**.

## Búsqueda Lineal

```java
public static int buscarLineal(int[] arreglo, int valor) {
    int pos = -1;
    int i = 0;
    while (pos == -1 && i < arreglo.length) {
        if (arreglo[i] == valor) pos = i;
        i++;
    }
    return pos;
}
```

### Complejidad:

- Caso peor: Θ(n)
- Caso óptimo: Θ(1)

## Búsqueda Binaria (Versión Recursiva)

```java
public static int buscarBinarioRec(int[] datos, int inicio, int fin, int objetivo) {
    if (inicio == fin) return inicio;
    int mitad = (inicio + fin) / 2;
    if (objetivo <= datos[mitad])
        return buscarBinarioRec(datos, inicio, mitad, objetivo);
    else
        return buscarBinarioRec(datos, mitad + 1, fin, objetivo);
}

public static int buscarBinario(int[] datos, int objetivo) {
    int n = datos.length;
    if (n == 0 || objetivo > datos[n - 1]) return n + 1;
    return buscarBinarioRec(datos, 0, n, objetivo);
}
```

## Búsqueda Binaria (Versión Iterativa)

```java
public static int buscarBinIterativo(int[] datos, int objetivo) {
    int n = datos.length;
    if (objetivo > datos[n - 1]) return n + 1;
    int ini = 0, fin = n;
    while (ini < fin) {
        int mid = (ini + fin) / 2;
        if (objetivo <= datos[mid])
            fin = mid;
        else
            ini = mid + 1;
    }
    return ini;
}
```

### Complejidad:

- Mejor caso: Θ(1)
- Peor caso: Θ(log n)
- Promedio: Θ(log n)

## Arreglo para Ejemplo de Evaluación

Arreglo de muestra:

```
[8, 10, 14, 24, 28, 35, 49, 56, 98]
```

Este arreglo permite validar paso a paso el comportamiento de los algoritmos propuestos.

## Observaciones Finales

Se ha demostrado cómo aplicar "divide y vencerás" permite optimizar algoritmos, especialmente en estructuras ordenadas. Comparado con la búsqueda secuencial, la binaria es considerablemente más rápida al escalar.

## Código de Ordenamiento — MergeSort

```java
public class MergeSortDemo {

    public static void mergeSort(int[] array, int inicio, int fin) {
        if (inicio >= fin) return;

        int mitad = (inicio + fin) / 2;
        mergeSort(array, inicio, mitad);
        mergeSort(array, mitad + 1, fin);
        combinar(array, inicio, mitad, fin);
    }

    private static void combinar(int[] array, int inicio, int mitad, int fin) {
        int[] temporal = new int[fin - inicio + 1];
        int i = inicio, j = mitad + 1, k = 0;

        while (i <= mitad && j <= fin) {
            temporal[k++] = (array[i] <= array[j]) ? array[i++] : array[j++];
        }

        while (i <= mitad) temporal[k++] = array[i++];
        while (j <= fin) temporal[k++] = array[j++];

        System.arraycopy(temporal, 0, array, inicio, temporal.length);
    }

    public static void main(String[] args) {
        int[] datos = {12, 3, 7, 9, 14, 6, 11, 2};
        System.out.println("Antes del ordenamiento:");
        imprimir(datos);
        mergeSort(datos, 0, datos.length - 1);
        System.out.println("Después del ordenamiento:");
        imprimir(datos);
    }

    private static void imprimir(int[] array) {
        for (int elemento : array) System.out.print(elemento + " ");
        System.out.println();
    }
}
```

/**
 *
 * @author kevin
 */
import java.util.*;

public class Semana14Analisis {

    static class Arista {
        int destino;
        int peso;

        public Arista(int destino, int peso) {
            this.destino = destino;
            this.peso = peso;
        }
    }

    public static void prim(int vertices, List<List<Arista>> grafo) {
        boolean[] visitado = new boolean[vertices];
        int[] padres = new int[vertices];
        int[] pesos = new int[vertices];

        Arrays.fill(pesos, Integer.MAX_VALUE);
        padres[0] = -1; // Nodo inicial
        pesos[0] = 0;

        for (int i = 0; i < vertices - 1; i++) {
            int u = minPeso(pesos, visitado, vertices);
            visitado[u] = true;

            for (Arista arista : grafo.get(u)) {
                int v = arista.destino;
                int peso = arista.peso;
                if (!visitado[v] && peso < pesos[v]) {
                    padres[v] = u;
                    pesos[v] = peso;
                }
            }
        }

        // Mostrar resultado
        int costoTotal = 0;
        System.out.println("Aristas del árbol de recubrimiento mínimo:");
        for (int i = 1; i < vertices; i++) {
            System.out.println(padres[i] + " - " + i + " : peso = " + pesos[i]);
            costoTotal += pesos[i];
        }
        System.out.println("Costo total del árbol: " + costoTotal);
    }

    private static int minPeso(int[] pesos, boolean[] visitado, int vertices) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int v = 0; v < vertices; v++) {
            if (!visitado[v] && pesos[v] < min) {
                min = pesos[v];
                minIndex = v;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de nodos: ");
        int vertices = sc.nextInt();

        List<List<Arista>> grafo = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            grafo.add(new ArrayList<>());
        }

        System.out.print("Ingrese el número de aristas: ");
        int aristas = sc.nextInt();

        System.out.println("Ingrese las aristas en formato: origen destino peso");
        for (int i = 0; i < aristas; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int peso = sc.nextInt();

            if (u < 0 || u >= vertices || v < 0 || v >= vertices) {
                System.out.println("Error: nodos fuera de rango. Intente de nuevo.");
                i--;
                continue;
            }

            // Grafo no dirigido: agregar ambas direcciones
            grafo.get(u).add(new Arista(v, peso));
            grafo.get(v).add(new Arista(u, peso));
        }

        prim(vertices, grafo);
        sc.close();
    }
}


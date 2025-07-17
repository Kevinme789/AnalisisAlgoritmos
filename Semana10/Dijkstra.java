import java.util.*;

public class Dijkstra {

    static class Nodo implements Comparable<Nodo> {
        int id;
        int distancia;

        Nodo(int id, int distancia) {
            this.id = id;
            this.distancia = distancia;
        }

        @Override
        public int compareTo(Nodo otro) {
            return Integer.compare(this.distancia, otro.distancia);
        }
    }

    public static int[] dijkstra(List<List<Nodo>> grafo, int inicio) {
        int n = grafo.size();
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[inicio] = 0;

        PriorityQueue<Nodo> pq = new PriorityQueue<>();
        pq.add(new Nodo(inicio, 0));

        while (!pq.isEmpty()) {
            Nodo actual = pq.poll();
            int u = actual.id;

            if (actual.distancia > dist[u]) continue;

            for (Nodo vecino : grafo.get(u)) {
                int v = vecino.id;
                int peso = vecino.distancia;

                if (dist[u] + peso < dist[v]) {
                    dist[v] = dist[u] + peso;
                    pq.add(new Nodo(v, dist[v]));
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de nodos: ");
        int n = sc.nextInt();

        List<List<Nodo>> grafo = new ArrayList<>();
        for (int i = 0; i < n; i++) grafo.add(new ArrayList<>());

        System.out.print("Número de aristas: ");
        int m = sc.nextInt();

        System.out.println("Ingrese aristas en formato: origen destino peso");
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            grafo.get(u).add(new Nodo(v, w));
        }

        System.out.print("Nodo inicio: ");
        int inicio = sc.nextInt();

        int[] distancias = dijkstra(grafo, inicio);

        System.out.println("Distancias mínimas desde el nodo " + inicio + ":");
        for (int i = 0; i < distancias.length; i++) {
            if (distancias[i] == Integer.MAX_VALUE)
                System.out.println("Nodo " + i + ": No alcanzable");
            else
                System.out.println("Nodo " + i + ": " + distancias[i]);
        }

        sc.close();
    }
}

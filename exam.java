import java.util.*;

class DijkstraAlgorithm {
    private int dist[];
    private Set<Integer> settled;
    private PriorityQueue<Node> pq;
    private int V;
    List<List<Node>> adj;

    public DijkstraAlgorithm(int V) {
        this.V = V;
        dist = new int[V];
        settled = new HashSet<>();
        pq = new PriorityQueue<>(V, new Node());
    }

    public void dijkstra(List<List<Node>> adj, int src) {
        this.adj = adj;

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        pq.add(new Node(src, 0));

        while (settled.size() != V) {
            if (pq.isEmpty()) return;

            int u = pq.remove().node;
            if (settled.contains(u)) continue;
            settled.add(u);

            processNeighbours(u);
        }
    }

    private void processNeighbours(int u) {
        int edgeDist, newDist;

        for (Node v : adj.get(u)) {
            if (!settled.contains(v.node)) {
                edgeDist = v.cost;
                newDist = dist[u] + edgeDist;

                if (newDist < dist[v.node]) {
                    dist[v.node] = newDist;
                }

                pq.add(new Node(v.node, dist[v.node]));
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Node>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(new Node(1, 9));
        adj.get(0).add(new Node(2, 6));
        adj.get(0).add(new Node(3, 5));
        adj.get(0).add(new Node(4, 3));
        adj.get(2).add(new Node(1, 2));
        adj.get(2).add(new Node(3, 4));

        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(V);
        dijkstra.dijkstra(adj, 0);

        System.out.println("Shortest distances from node 0:");
        for (int i = 0; i < dijkstra.dist.length; i++) {
            System.out.println("To node " + i + " is " + dijkstra.dist[i]);
        }
    }
}

class Node implements Comparator<Node> {
    public int node;
    public int cost;

    public Node() {}

    public Node(int node, int cost) {
        this.node = node;
        this.cost = cost;
    }

    @Override
    public int compare(Node node1, Node node2) {
        if (node1.cost < node2.cost)
            return -1;
        if (node1.cost > node2.cost)
            return 1;
        return 0;
    }
}


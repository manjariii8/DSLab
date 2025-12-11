//Write a Program to implement BFS of graph.
import java.util.*;

public class Program24 {

    public static void BFS(Map<Integer, List<Integer>> graph, int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);
        System.out.println("*****Program24 Output*****");

        System.out.print("BFS traversal starting from node " + start + ": ");

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(4, 5));
        graph.put(3, Arrays.asList(6));
        graph.put(4, Arrays.asList());
        graph.put(5, Arrays.asList());
        graph.put(6, Arrays.asList());

        BFS(graph, 1); 
    }
}

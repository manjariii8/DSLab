//Write a Program to implement DFS of graph
import java.util.*;

public class Program25 {

    // DFS function using recursion
    public static void DFS(Map<Integer, List<Integer>> graph, int node, Set<Integer> visited) {
        visited.add(node);
        System.out.print(node + " ");

        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                DFS(graph, neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("*****Program25 Output*****");
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(4, 5));
        graph.put(3, Arrays.asList(6));
        graph.put(4, Arrays.asList());
        graph.put(5, Arrays.asList());
        graph.put(6, Arrays.asList());

        Set<Integer> visited = new HashSet<>();
        System.out.print("DFS traversal starting from node 1: ");
        DFS(graph, 1, visited);
    }
}


package algoritm_06_breadth_first_search;

import java.util.*;

public class BreadthFirstSearch {
    private static Map<String, List<String>> graph = new HashMap<>();

    private static boolean search(String name) {
        // создание двухсторонней очереди. поиск начинается с you
        Queue<String> searchQueue = new ArrayDeque<>(graph.get(name));
        // этот массив используется для отслеживания уже проверенных людей
        List<String> searched = new ArrayList<>();

        // пока очередь не пуста из очереди извлекается первый человек с удалением из начала очереди poll()
        while (!searchQueue.isEmpty()) {
            String person = searchQueue.poll();
            // человек проверяется только если не проверяли ранее, т.е. если он не содержится в searched
            if (!searched.contains(person)) {
                if (person_is_seller(person)) {
                    System.out.println(person + " is a mango seller!");
                    return true;
                } else {
                    // не продавец манго, все его друзья добавляются в очередь поиска
                    searchQueue.addAll(graph.get(person));
                    // человек помечается как уже проверенный
                    searched.add(person);
                }
            }
        }

        return false;
    }

    private static boolean person_is_seller(String name) {
        return name.endsWith("m");
    }

    public static void main(String[] args) {
        graph.put("you", Arrays.asList("alice", "bob", "claire"));
        graph.put("bob", Arrays.asList("anuj", "peggy"));
        graph.put("alice", Arrays.asList("peggy"));
        graph.put("claire", Arrays.asList("thom", "jonny"));
        graph.put("anuj", Collections.emptyList());
        graph.put("peggy", Collections.emptyList());
        graph.put("thom", Collections.emptyList());
        graph.put("jonny", Collections.emptyList());

        search("you");
    }
}

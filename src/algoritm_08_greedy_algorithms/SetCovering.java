package algoritm_08_greedy_algorithms;
import java.util.*;

public class SetCovering {

    public static void main(String[] args) {
        // Список штатов. Переданный массив преобразуется в множество, т.к. множество исключает дубликаты
        Set<String> statesNeeded = new HashSet(Arrays.asList("mt", "wa", "or", "id", "nv", "ut", "ca", "az"));
        Map<String, Set<String>> stations = new LinkedHashMap<>();

        stations.put("kone", new HashSet<>(Arrays.asList("id", "nv", "ut")));
        stations.put("ktwo", new HashSet<>(Arrays.asList("wa", "id", "mt")));
        stations.put("kthree", new HashSet<>(Arrays.asList("or", "nv", "ca")));
        stations.put("kfour", new HashSet<>(Arrays.asList("nv", "ut")));
        stations.put("kfive", new HashSet<>(Arrays.asList("ca", "az")));

        Set<String> finalStations = new HashSet<String>();
        while (!statesNeeded.isEmpty()) {
            String bestStation = null; // станция, обслуживающая больше всего штатов, не входящих в текущее покрытие
            Set<String> statesCovered = new HashSet<>(); // все штаты, обслуживаемые этой станцией

            // перебирает все станции и находит среди них наилучшую
            for (Map.Entry<String, Set<String>> station : stations.entrySet()) {
                Set<String> covered = new HashSet<>(statesNeeded);
                covered.retainAll(station.getValue());

                if (covered.size() > statesCovered.size()) {
                    bestStation = station.getKey();
                    statesCovered = covered;
                }
            }
            statesNeeded.removeIf(statesCovered::contains);

            if (bestStation != null) {
                finalStations.add(bestStation);
            }
        }
        System.out.println(finalStations); // [ktwo, kone, kthree, kfive]
    }
}

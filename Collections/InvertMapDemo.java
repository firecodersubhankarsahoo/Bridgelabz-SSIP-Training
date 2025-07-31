import java.util.*;

public class InvertMapDemo {
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> map) {
        Map<V, List<K>> inverted = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();
            inverted.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }
        return inverted;
    }

    public static String keyWithMaxValue(Map<String, Integer> map) {
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }

    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> result = new HashMap<>(map1);
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            result.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);
        Map<Integer, List<String>> output = invertMap(input);
        System.out.println("Inverted Map: " + output);
        // Example for keyWithMaxValue
        Map<String, Integer> testMap = new HashMap<>();
        testMap.put("A", 10);
        testMap.put("B", 20);
        testMap.put("C", 15);
        String maxKey = keyWithMaxValue(testMap);
        System.out.println("Key with max value: " + maxKey);

        // Example for mergeMaps
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> mergedMap = mergeMaps(map1, map2);
        System.out.println("Merged Map: " + mergedMap);
    }
}

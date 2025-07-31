import java.util.*;

public class FrequencyCounter {
    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> freqMap = new HashMap<>();
        for (String s : list) {
            freqMap.put(s, freqMap.getOrDefault(s, 0) + 1);
        }
        return freqMap;
    }

    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> result = countFrequency(items);
        System.out.println("Frequency Map: " + result);
    }
}

import java.io.*;
import java.util.*;

public class WordFrequencyCounterDemo {
    public static Map<String, Integer> countWordFrequency(String filename) {
        Map<String, Integer> freqMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Remove punctuation and convert to lower case
                line = line.replaceAll("[\\p{Punct}]", "").toLowerCase();
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return freqMap;
    }

    public static void main(String[] args) {
        String filename = "input.txt"; // Change to your file path
        Map<String, Integer> result = countWordFrequency(filename);
        System.out.println("Word Frequency: " + result);
    }
}


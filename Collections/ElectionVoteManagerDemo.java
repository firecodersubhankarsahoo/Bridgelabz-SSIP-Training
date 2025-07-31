import java.util.*;

public class ElectionVoteManagerDemo {
    // HashMap: Candidate -> Votes
    private Map<String, Integer> voteMap = new HashMap<>();
    // LinkedHashMap: maintains order of votes
    private Map<String, Integer> orderedVoteMap = new LinkedHashMap<>();
    // TreeMap: sorted by candidate name
    private Map<String, Integer> sortedVoteMap = new TreeMap<>();

    // Add or update vote for a candidate
    public void addVote(String candidate, int votes) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + votes);
        orderedVoteMap.put(candidate, orderedVoteMap.getOrDefault(candidate, 0) + votes);
        sortedVoteMap.put(candidate, sortedVoteMap.getOrDefault(candidate, 0) + votes);
    }

    // Display votes in insertion order
    public void displayOrderedVotes() {
        System.out.println("Votes in insertion order:");
        for (Map.Entry<String, Integer> entry : orderedVoteMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Display votes in sorted order
    public void displaySortedVotes() {
        System.out.println("Votes in sorted order:");
        for (Map.Entry<String, Integer> entry : sortedVoteMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        ElectionVoteManagerDemo manager = new ElectionVoteManagerDemo();
        manager.addVote("Alice", 10);
        manager.addVote("Bob", 15);
        manager.addVote("Charlie", 12);
        manager.addVote("Bob", 5); // Bob gets more votes
        manager.displayOrderedVotes();
        manager.displaySortedVotes();
    }
}


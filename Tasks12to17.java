import java.util.*;

public class Tasks12to17 {
    public static void main(String[] args) {

        // Task 12: Word Frequency
        String text = "Java is fun and Java is powerful and fun";
        String[] words = text.toLowerCase().split(" ");
        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String w : words) {
            wordCount.put(w, wordCount.getOrDefault(w, 0) + 1);
        }

        System.out.println("Word frequency: " + wordCount);

        // Task 13: Character frequency
        String str = "Mississippi";
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character frequency: " + charCount);

        // Task 14: Group words by length
        String[] list = {"hi", "book", "java", "sun", "loop", "map"};
        HashMap<Integer, ArrayList<String>> group = new HashMap<>();

        for (String w : list) {
            group.putIfAbsent(w.length(), new ArrayList<>());
            group.get(w.length()).add(w);
        }

        System.out.println("Grouped by length: " + group);

        // Task 15: First non-repeating char
        String test = "swiss";
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : test.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (char c : test.toCharArray()) {
            if (freq.get(c) == 1) {
                System.out.println("First non-repeating: " + c);
                break;
            }
        }

        // Task 16: Two Sum
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        HashMap<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (indexMap.containsKey(complement)) {
                System.out.println("Two sum indices: " + indexMap.get(complement) + ", " + i);
            }
            indexMap.put(nums[i], i);
        }

        // Task 17: Detect duplicates
        String[] items = {"apple", "banana", "apple", "orange", "banana", "kiwi"};
        HashMap<String, Integer> countMap = new HashMap<>();

        for (String item : items) {
            countMap.put(item, countMap.getOrDefault(item, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate: " + entry.getKey() + " x" + entry.getValue());
            }
        }
    }
}

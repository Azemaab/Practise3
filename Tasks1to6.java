import java.util.*;

public class Tasks1to6 {
    public static void main(String[] args) {

        // Task 1: Create & Put
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aida", 85);
        map.put("Azat", 92);
        map.put("Dana", 77);

        System.out.println("Map: " + map);
        System.out.println("Size: " + map.size());

        // Task 2: Get & containsKey
        System.out.println("Aida score: " + map.get("Aida"));

        if (map.containsKey("Mira")) {
            System.out.println("Mira found");
        } else {
            System.out.println("Mira not found");
        }

        // Task 3: Update existing value
        Integer oldValue = map.put("Dana", 80);
        System.out.println("Old Dana score: " + oldValue);
        System.out.println("Updated map: " + map);

        // Task 4: Remove by key
        System.out.println("Remove Azat: " + map.remove("Azat"));
        System.out.println("Remove NonExisting: " + map.remove("NonExisting"));

        // Task 5: isEmpty & clear
        System.out.println("Is empty: " + map.isEmpty());
        map.clear();
        System.out.println("After clear, is empty: " + map.isEmpty());

        // Re-insert for next task
        map.put("Aida", 85);
        map.put("Dana", 80);

        // Task 6: getOrDefault
        int score = map.getOrDefault("Mira", -1);
        if (score == -1) {
            System.out.println("Mira not found");
        } else {
            System.out.println(score);
        }
    }
}

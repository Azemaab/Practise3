import java.util.*;

public class Tasks7to11 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Aida", 85);
        map.put("Dana", 80);

        // Task 7: putIfAbsent
        map.putIfAbsent("Aida", 90);
        map.putIfAbsent("Mira", 88);
        System.out.println("After putIfAbsent: " + map);

        // Task 8: replace
        map.replace("Aida", 85, 86);
        map.replace("Aida", 91);
        System.out.println("After replace: " + map);

        // Task 9: Iterate
        System.out.println("Keys:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("Values:");
        for (Integer value : map.values()) {
            System.out.println(value);
        }

        System.out.println("Entries:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Task 10: Count scores >= 80
        int count = 0;
        for (Integer value : map.values()) {
            if (value >= 80) count++;
        }
        System.out.println("Scores >= 80: " + count);

        // Task 11: Find max score
        int max = 0;
        String bestStudent = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                bestStudent = entry.getKey();
            }
        }

        System.out.println("Max score: " + max + " by " + bestStudent);
    }
}

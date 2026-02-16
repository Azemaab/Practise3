import java.util.*;

public class Tasks18to22 {
    public static void main(String[] args) {

        // Task 18: equals & hashCode
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("B", 2);
        map2.put("A", 1);

        System.out.println("Maps equal: " + map1.equals(map2));
        System.out.println("HashCodes: " + map1.hashCode() + " " + map2.hashCode());

        // Task 19: Remove entries conditionally
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Aida", 85);
        students.put("Dana", 55);

        Iterator<Map.Entry<String, Integer>> iterator = students.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < 60) {
                iterator.remove();
            }
        }
        System.out.println("After removal: " + students);

        // Task 20: Merge scores
        HashMap<String, Integer> scores1 = new HashMap<>();
        scores1.put("Aida", 40);
        scores1.put("Azat", 35);
        scores1.put("Dana", 50);

        HashMap<String, Integer> scores2 = new HashMap<>();
        scores2.put("Azat", 10);
        scores2.put("Dana", 5);
        scores2.put("Mira", 45);

        for (Map.Entry<String, Integer> entry : scores2.entrySet()) {
            scores1.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        System.out.println("Merged scores: " + scores1);

        // Task 21: Invert map
        HashMap<String, Integer> original = new HashMap<>();
        original.put("Aida", 90);
        original.put("Dana", 90);
        original.put("Mira", 85);

        HashMap<Integer, ArrayList<String>> inverted = new HashMap<>();

        for (Map.Entry<String, Integer> entry : original.entrySet()) {
            inverted.putIfAbsent(entry.getValue(), new ArrayList<>());
            inverted.get(entry.getValue()).add(entry.getKey());
        }

        System.out.println("Inverted map: " + inverted);

        // Task 22: Top-K frequent words
        HashMap<String, Integer> freqMap = new HashMap<>();
        freqMap.put("java", 5);
        freqMap.put("code", 3);
        freqMap.put("map", 7);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(freqMap.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("Top 2 words:");
        for (int i = 0; i < 2; i++) {
            System.out.println(list.get(i));
        }
    }
}

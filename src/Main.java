import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 > 0) {
                System.out.print(num + " ");
            }

        }
        System.out.println();
        System.out.println("Задача 2");
        Set<Integer> uniqueNums = new HashSet<>();

        for (Integer num : nums) {
            if (num % 2 == 0 && !uniqueNums.contains(num)) {
                System.out.print(num + " ");
                uniqueNums.add(num);
            }
        }
        System.out.println();
        System.out.println("Задача 3");
        List<String> strings = new ArrayList<>(List.of("apple", "water", "summer", "name", "water", "name"));
        Set<String> uniqueWords = new HashSet<>(strings);
        System.out.println(uniqueWords);
        System.out.println("Задача 4");
        List<String> strings2 = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Map<String, Integer> numWords = new HashMap<>();
        for (String string : strings2) {
            if (numWords.containsKey(string)) {
                Integer currentRepeat = numWords.get(string);
                numWords.put(string, currentRepeat + 1);
            } else {
                numWords.put(string, 1);
            }
            
        }
        System.out.println(numWords);



    }
}
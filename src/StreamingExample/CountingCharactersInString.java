package StreamingExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountingCharactersInString {

    public static void countOfThecharacter() {
        String randomString = "Hello everyone out there";

        Map<Character, Integer> countChar = new HashMap<>();

        char[] ch = randomString.toCharArray();
        for (char c : ch) {
            if (countChar.containsKey(c)) {
                countChar.put(c, countChar.get(c) + 1);
            } else {
                countChar.put(c, 1);
            }
        }
        System.out.println(countChar);

        Set<Map.Entry<Character, Integer>> setCharCountDisplay = countChar.entrySet();
        for (Map.Entry<Character, Integer> e : setCharCountDisplay) {
            System.out.println("Count Of the char from given String: " + e.getKey() + " = " + e.getValue());
        }
    }

    public static void countOfString() {
        String collectionOfString = "Hello Everyone Out There contains There";
        String[] splitingString = collectionOfString.split(" ");
        Map<String, Integer> stringCountValues = new HashMap<>();

        for (String c : splitingString) {
            if (stringCountValues.containsKey(c)) {
                stringCountValues.put(c, stringCountValues.get(c) + 1);
            } else {
                stringCountValues.put(c, 1);
            }
        }
        System.out.println(stringCountValues);

        Set<Map.Entry<String, Integer>> value = stringCountValues.entrySet();
        for (Map.Entry<String, Integer> entry : value) {
            System.out.println("Count Of the String :" + entry.getKey() + " = " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        countOfThecharacter();
        countOfString();
    }

}


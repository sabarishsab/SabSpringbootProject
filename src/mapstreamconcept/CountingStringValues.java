package mapstreamconcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountingStringValues {



    public void countCharacter() {
        String familyName = "VonnurVallaiyapathiSenguttuvan";

        Map<Character, Integer> mapCountValues = new HashMap<>();
        char[] ch = familyName.toCharArray();
        for (char c : ch) {
            if (mapCountValues.containsKey(c)) {
                mapCountValues.put(c, mapCountValues.get(c) + 1);
            } else {
                mapCountValues.put(c, 1);
            }
        }
        System.out.println(mapCountValues);

        Set<Map.Entry<Character, Integer>> se = mapCountValues.entrySet();
        for (Map.Entry<Character, Integer> e : se) {
            System.out.println("Count Of a Given Value : " + e.getKey() + "=" + e.getValue());
        }
    }

    public void countOfGivenWords(){

        String sab = "My country India is a beautiful country India";

        String[] splitingEachWords = sab.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String s : splitingEachWords) {

            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }
            else {
                map.put(s,1);
            }
}
        System.out.println(map);

        Set<Map.Entry<String, Integer>> setCount = map.entrySet();
        for (Map.Entry<String, Integer> entry : setCount) {
            System.out.println("Count Of the Words : " + entry);
        }
    }

    public static void main(String[] args) {
        CountingStringValues countingStringValues = new CountingStringValues();
        countingStringValues.countCharacter();
        countingStringValues.countOfGivenWords();

    }
}

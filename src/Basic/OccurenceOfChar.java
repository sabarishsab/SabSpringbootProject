package Basic;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfChar {

    public static void main(String[] args) {
        String name = "Sabarish";
        occurenceOfChar(name);
    }

    private static void occurenceOfChar(String name) {
        Map<Character,Integer> map = new HashMap<>();
        char[] ch = name.toCharArray();
        for (char c : ch) {
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else {
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}

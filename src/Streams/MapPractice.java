package Streams;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<Integer,String> mapKeyValuePairs = new HashMap<>();
        mapKeyValuePairs.put(1, "sab");
        mapKeyValuePairs.put(2, "sasa");
        mapKeyValuePairs.put(3, "shys");
        mapKeyValuePairs.put(4, "sasas");

       mapKeyValuePairs.forEach((key, value) -> System.out.println(key +" : "+value));
       mapKeyValuePairs.entrySet().stream().forEach(System.out::println);



    }
}

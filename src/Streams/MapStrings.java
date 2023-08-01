package Streams;

import java.time.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStrings {

    public static void main(String[] args) {

//        Map<String,Integer> map = new HashMap<>();
//        map.put("sab", 1);
//        map.put("sss", 2);
//        map.put("sas", 3);

//        List<String> items = new ArrayList<>();
//        items.add("strsab");
//        items.add("sab");
//        items.add("strshy");
//        items.add("strsas");
//        items.add("ab");
//
//        String prefix = "str";
//
//        List<String> filteredList = items.stream().
//                filter(e -> (!e.startsWith(prefix))).
//                collect(Collectors.toList());
//
//        System.out.println("List are :" + filteredList);
//
//        List<String> alphabets = Arrays.asList(new String[] { "a","b","c","d","e"});
//
//       alphabets.forEach(a -> a.toUpperCase());

        LocalDateTime localDateTime = LocalDateTime.now();
//2023-01-04T18:40:48.872208
        System.out.println(localDateTime.toString());

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        System.out.println(offsetDateTime.toString());

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println(zonedDateTime);




    }
}

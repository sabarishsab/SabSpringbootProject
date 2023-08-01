package org.streamPackage;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamInstance {

    public static void main(String[] args) {

        for (String s : Arrays.asList("sabarish", "appa", "amma")) {
            System.out.println(s);
        }

        System.out.println("--------------------------------------------");

        List<String> stringList = Arrays.asList("sabarish", "appa", "amma");
        for (String appa : stringList.stream().filter(s -> s.equalsIgnoreCase("appa")).collect(Collectors.toList())) {
            System.out.println(appa);
        }

        System.out.println("--------------------------------------------");

        String[] stringArrays = {"sabarish", "appa", "amma","appa"};
        Stream<String> stream = Arrays.stream(stringArrays);
        List<String> a = stream.collect(Collectors.toList());
        System.out.println(a);

        Arrays.asList("sab","appp");

        System.out.println("Min and Max Number finding--------");
        //Min and Max Number finding
        List<Integer> integerList = Arrays.asList(23, 5, 66, 78, 9);
        Optional<Integer> optionalIntegerMin = integerList.stream().min(Comparator.naturalOrder());
        optionalIntegerMin.ifPresent(System.out::println);

        Optional<Integer> optionalIntegerMax = integerList.stream().max(Comparator.naturalOrder());
        optionalIntegerMax.ifPresent(System.out::println);

        //For finding the count of the given list
        List<String> stringList1 = Arrays.asList("sab", "appa", "Amma");
        Long collect = stringList1.stream().count();
        System.out.println(collect);

        System.out.println("--------------------------------------------");


                IntStream.range(1,10).forEach(System.out::println);
        IntStream.rangeClosed(1,10).forEach(System.out::println);

    }
}

package Java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNumOfChar {

    public static void main(String[] args) {

        String input = "IloveSabarish";

        Map<String, Long> map =  Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);

        int arr[] = {1,2,3,4,5};
        for (int i = 0; i < arr.length-2; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}

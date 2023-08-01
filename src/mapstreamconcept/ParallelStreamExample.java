package mapstreamconcept;

import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static void main(String[] args) {
        long start = 0;
        long end = 0;

//        start = System.currentTimeMillis();
//        IntStream.range(1,100).forEach(System.out ::print);
//        end = System.currentTimeMillis();
//        System.out.print("Normal Stream :" + (end-start));
//
//        start = System.currentTimeMillis();
//        IntStream.range(1,100).parallel().forEach(System.out ::print);
//        end = System.currentTimeMillis();
//        System.out.print("Parallel Stream Result:" + (end - start));


        IntStream.range(1,10).forEach(i -> {
                System.out.println("Thread: " + Thread.currentThread().getName() + i);
                });

        IntStream.range(1,10).parallel().forEach(i -> {
                    System.out.println("Thread: " + Thread.currentThread().getName() + i);
                });
    }
}

package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamClass {

    public static void main(String[] args) {

        List<Integer> listStream = Arrays.asList(1,2,3,4,5,6,7,8);

//        for (int i = 0; i < listStream.size(); i++) {
//            System.out.println("List are :" + listStream.get(i));
//        }

//        for (int value:
//             listStream) {
//            System.out.println("List :" + value);
//        }

//        Iterator<Integer> it = listStream.iterator();
//        while (it.hasNext()) {
//            System.out.println("List Are :" + it.next());
//        }

        listStream.forEach(i -> System.out.println("List are :" + i));
    }
}

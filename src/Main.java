import java.util.*;

public class Main {

    public static void printSecondLargestNumber(int arr[]){
        int sizeOfArray = arr.length;
        if (sizeOfArray  < 2) {
System.out.println("Given input was wrong");
return;
        }

        Arrays.sort(arr);
        System.out.println(arr[sizeOfArray - 5]);

    }
    public static void main(String[] args) {

        int arr[] = new int[] {1, 5, 8, 10, 55,56};

        printSecondLargestNumber(arr);

//        System.out.println("Hello world!");

//        ArrayList<Integer> aList = new ArrayList<Integer>();
//
//        aList.add(1);
//        aList.add(2);
//        aList.add(3);
//        aList.add(4);
//        aList.add(5);
//        aList.add(6);
//        aList.add(7);
//        for (int a:aList
//             ) {
//            System.out.println(a);
//        }
//        System.out.println(aList);
//        System.out.println(aList.size());

//        ArrayList<String> stringIterator = new ArrayList<String>();
//        stringIterator.add("Senguttuvan");
//        stringIterator.add("Shakila");
//        stringIterator.add("Sudarsun");
//        stringIterator.add("Shylaja");
//        stringIterator.add("Janani");
//        stringIterator.add("Sabarish");
//        Iterator sab = stringIterator.iterator();
//        while (sab.hasNext()) {
//            System.out.println(sab.next());
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println("array of values"+ i);

//        PriorityQueue<Integer> sab = new PriorityQueue<>();
//        sab.add(1);
//        sab.add(2);
//        sab.add(3);
//        sab.add(4);
//        System.out.println("Head Return " + sab.peek());
//        System.out.println("Head Remove " + sab.remove());
//        System.out.println("Head Return " + sab.peek());
//        System.out.println("Poll" + sab.poll());
//        System.out.println("Size" + sab.size());
////}


    }
}
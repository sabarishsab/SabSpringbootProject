package set;

import java.util.Arrays;

public class SortingSomeValuesUsingComparator {

    public static void main(String[] args) {

        String[] arr = {"sabarish", "Arun", "Revolver"};
        int[] in = {1, 2, 9, 5, 6};
        System.out.println("Before Sorting of an String");
        for (String i : arr) {
            System.out.println(i);
        }
        System.out.println("After Sorting of an String");
        ComparatorClass cc = new ComparatorClass();
        Arrays.sort(arr,cc);
        for (String i : arr) {

            System.out.println(i);
        }
        System.out.println("Before Sorting of an Array");
        for (int i : in) {
            System.out.println(i);
        }
        System.out.println("After Sorting of an Array");
        Arrays.sort(in);
        for (int i : in) {
            System.out.println(i);
        }

    }
}

package Streams;

import java.util.ArrayList;
import java.util.List;

public class AddingHundredValues {

    public static void main(String[] args) {

        List<Integer> listOfHundredValues = new ArrayList<Integer>();

        for (int i = 0; i <=100 ; i++ ) {
         listOfHundredValues.add(i);
        }

        for (int list: listOfHundredValues
             ) {
            System.out.println("List of 100 Values:" + list);
        }
    }
}

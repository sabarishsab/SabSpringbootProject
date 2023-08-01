package samplepackage;

import java.util.Arrays;

public class SamplePrograms {
    public static void main(String[] args) {

        String[] sab = {"sabarish", "Appa", "Amma"};
        System.out.println("Before sorting the given String of Array's");
        for (String s : sab) {
            System.out.println(s);
        }
        System.out.println("After sorting the given String of Array's");
        Arrays.sort(sab);
        for (String s : sab) {
            System.out.println(s);
        }
    }
}

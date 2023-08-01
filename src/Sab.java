import java.util.Arrays;
import java.util.Scanner;

public class Sab {


    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        String series = "";
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            series = series+c;
        }
        System.out.print(series);
        System.out.println();

        String name = "Sabarish Senguttuvan";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Arrays.toString(name.split(" ")));


    }
}

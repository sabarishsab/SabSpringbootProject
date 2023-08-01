package patternsprogram;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PatternPrograms {
    public static void pyramidPattern(int n) {
        for (int i = 1; i < n; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
        {
            for (int j = i; j < 5; j++) //inner loop for number of columns
            {
                System.out.print("* "); //print star
            }
            System.out.println(); //ending line after each row
        }
    }

    public static void main(String args[]) //driver function
    {
        int n = 5;
        pyramidPattern(n);

        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now().getClass());

    }
}
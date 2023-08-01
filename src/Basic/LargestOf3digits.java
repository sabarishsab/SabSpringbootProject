package Basic;

import java.awt.*;
import java.util.Scanner;

public class LargestOf3digits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A number:");
        int a = input.nextInt();

        System.out.print("Enter B number:");
        int b = input.nextInt();

        System.out.print("Enter C number:");
        int c = input.nextInt();

//        if(a > b && a > c){
//            System.out.print("A is Greater");
//        } else if (b > a && b > c) {
//            System.out.print("b is greater");
//        }
//        else {
//            System.out.print("C is greater");
//        }

//        int largest = ;
        int largest2 = c > (a > b ? a : b) ? c : (a > b ? a : b);

        System.out.print("Largest number is :"+ largest2);


    }
}

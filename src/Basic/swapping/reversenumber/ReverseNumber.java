package Basic.swapping.reversenumber;

import java.util.Scanner;

import static java.lang.Integer.reverse;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to reverse:");
        int num = input.nextInt();

//        int rev = 0;
//
//        while (num != 0) {
//            rev = rev*10 + num%10;
//            num = num/10;
//        }
//int rev = reverse(num);
//        System.out.println(rev);

//        StringBuffer sab = new StringBuffer(String.valueOf(num));
//        StringBuffer rev = sab.reverse();
//        System.out.println("Reversed Number:" + rev);

        StringBuilder sb = new StringBuilder();
        sb.append(num);
        StringBuilder rev = sb.reverse();
        System.out.println(rev);
    }
}

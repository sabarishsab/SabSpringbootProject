package calculator;

import java.util.List;
import java.util.Scanner;

public class CalculatorProgram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  operator");
        char op = input.next().trim().charAt(0);
        int ans = 0;
        while (true) {
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.println("Enter two numbers : ");
                int value1 = input.nextInt();
                int value2 = input.nextInt();

                if (op == '+') {
                    ans = value1 + value2;
                }
                if (op == '-') {
                    ans = value1 - value2;
                }
                if (op == '*') {
                    ans = value1 * value2;
                }
                if (op == '/') {
                    if (value2 != 0) {
                        ans = value1 / value2;
                    }
                }
                if (op == '%') {
                    ans = value1 % value2;
                }
            }  else {
                System.out.println("Invalid Operator Sorry Please enter the correct Operator");
                break;
            }

            System.out.println("Answer is : " + ans);
        }


    }
}

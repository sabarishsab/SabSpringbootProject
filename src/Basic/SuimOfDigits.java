package Basic;

public class SuimOfDigits {

    public static void main(String[] args) {

        int dig = 12341234;

        int sum = 0;

        while(dig >0){
            sum += dig%10;
            dig = dig/10;
        }
        System.out.println(sum);


        int numbe = 42342422;
        int sum1=0;

        while(numbe > 0) {
            sum1 += numbe%10;
            numbe = numbe/10;
        }
        System.out.println("Sum of numbers :" + sum1);
    }


}

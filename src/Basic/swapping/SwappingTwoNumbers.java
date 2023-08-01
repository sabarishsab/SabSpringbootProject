package Basic.swapping;

public class SwappingTwoNumbers {

    public static void main(String[] args) {

        int a=10,b=20;

        System.out.println("Before Swapping Two numbers:" + " a " + a + " b " + b);

        //Logic 1 - Third Variable
        int t=a;
        a=b;
        b=t;

        System.out.println("After Swapping Two numbers:" + " a " + a + " b " + b);

        //Logic 2 - using + & not using third variable
        a = a+b;
        b = a-b;
        a= a-b;

        System.out.println("After Swapping Two numbers:" + " a " + a + " b " + b);

        //Logic 3 - using + / not using third variable

        a= a*b;
        b= a/b;
        a = a/b;
        System.out.println("After Swapping Two numbers:" + " a " + a + " b " + b);

        //Logic 4 - using + / not using third variable
        a = a^b;
        b =a^b;
        a = a^b;

        System.out.println("After Swapping Two numbers:" + " a " + a + " b " + b);

        //Logic 5 - using + / not using third variable
        b= a+b - (a=b);
        System.out.println("After Swapping Two numbers:" + " a " + a + " b " + b);


    }
}

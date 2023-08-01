package Basic;

import java.util.Random;

public class RandomNumbersToPrint {

    public static void main(String[] args) {

        Random random = new Random();
         int ran = random.nextInt();
         System.out.println(ran);

         double dou = random.nextDouble();
         System.out.println(dou);

         float flo = random.nextFloat();
         System.out.println(flo);

         int randomNumber = new Random().nextInt();
        System.out.println("Random Numbers are :" + randomNumber);

        float randomFloatNumber = new Random().nextFloat();
        System.out.println("Random float numbers are : " + randomFloatNumber);
//
//         short sho = random.nextFloat();
//         System.out.println(sho);
//        RandomStringUtils
    }
}

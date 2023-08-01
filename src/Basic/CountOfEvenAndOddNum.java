package Basic;

public class CountOfEvenAndOddNum {

    public static void main(String[] args) {
        int num = 1234787699;

        int evenCount = 0;
        int oddCount = 0;

        while (num > 0){
            int rem = num%10;

            if(rem%2 == 0){
                evenCount++;
            }
            else {
                oddCount++;
            }

            num = num/10;
        }
        System.out.println("Even Count : " +evenCount+ " Odd Count : " + oddCount);
    }
}

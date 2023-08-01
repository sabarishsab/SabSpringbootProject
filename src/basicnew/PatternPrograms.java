package basicnew;

public class PatternPrograms {

    public static void main(String[] args) {

        for (int row = 1; row <=5 ; row++) {
            for (int col =1; col < row; col++) {
                System.out.print(" " + " ");
            }
            for (int col1 = 1; col1 <= 6-row; col1++) {
                System.out.print(" " + "$" + " ");
            }
            System.out.println();
        }
    }
}


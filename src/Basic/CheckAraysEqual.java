package Basic;

import java.util.Arrays;

public class CheckAraysEqual {

    public static void main(String[] args) {
        int a1[] = {1,2,3,4,5,6};
        int a2[] = {1,2,3,5,5};

//        Boolean status = Arrays.equals(a1,a2);
//
//        if (status == Boolean.TRUE) {
//            System.out.println("Both Arrays are Equal");
//        }
//        else {
//            System.out.println("Both Arrays are not Equal");
//        }
        boolean status = true;

        if(a1.length == a2.length){
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != a2[i]) {
                    status = false;
}
            }
        }
        else {
            status = false;
        }

        if (status == true) {
            System.out.println("Arrays are Equal");
        } else if (status == false) {

            System.out.println("Arrays are Not Equal");
        }

    }
}

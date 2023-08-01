package Basic.reversestring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseAString {

    public static void main(String[] args) {
        String str = "sabrish";
        String rev = "";
        int len = str.length();


//        for (int i = len-1; i>=0; i--){
//            rev = rev+str.charAt(i);
//        }
//        char[] ch = str.toCharArray();
//        for(int i = len - 1; i >= 0; i--){
//            rev = rev + ch[i];
//        }

        char reverse1;
        for (int a = 0; a < str.length(); a++) {
            reverse1 = str.charAt(a);
            rev = reverse1 + rev;
        }
        System.out.println("Using Normal for loop Old : " +rev);



//System.out.println("Using Normal for loop :" +rev);
//        System.out.println(ch[3]);

        char[] sab = str.toCharArray();
        List<Character> list1 = new ArrayList<>();
        for (char w:
             sab) {
            list1.add(w);
            Collections.reverse(list1);
            ListIterator li = list1.listIterator();
            while (li.hasNext())
                System.out.print(li.next());
        }


    }
}

package set;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class SetRelatedPrograms {

    public void sortingUsingSet(){

        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(6);
        ll.add(3);
        ll.add(5);
        ll.add(2);
        ll.add(2);
        System.out.println(ll);
        for (Object a : ll)
            System.out.println(a);
    }

    public void sortingUsingArrayList(){

        ArrayList ll = new ArrayList();
        ll.add(1);
        ll.add(60);
        ll.add(30);
        ll.add(50);
        ll.add(2);
        ll.add(2);
        ll.add(1);
        ll.add(60);
        ll.add(30);
        ll.add(50);
        System.out.println(ll);

        for (Object a : ll) {
            System.out.println(a);
        }

    }

    public static void main(String[] args) {

        SetRelatedPrograms srp = new SetRelatedPrograms();
        srp.sortingUsingSet();
        srp.sortingUsingArrayList();
    }
}

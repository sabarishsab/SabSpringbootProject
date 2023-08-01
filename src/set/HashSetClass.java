package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetClass {

    public static void main(String[] args) {
        Set<Employee> s = new HashSet<Employee>();
        s.add(new Employee("Sabarish", 124, "IT"));
        s.add(new Employee("Sabarish", 124, "IT"));

        Iterator<Employee> it = s.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

//        for (Employee e : s) {
//            System.out.println(e);
//        }
//        s.stream().
//                filter(e -> s.contains(123)).
//                forEach(ss -> System.out.println(ss));
    }
}

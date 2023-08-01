package mapstreamconcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMobileIteration {

    public static void main(String[] args) {

        Mobile mb1 = new Mobile(2, "Apple", 75000);
        Mobile mb2 = new Mobile(5, "Samsung", 25000);
        Mobile mb3 = new Mobile(4, "Vivo", 12000);
        Mobile mb4 = new Mobile(6, "Oppo", 11000);
        Mobile mb5 = new Mobile(7, "Oppo", 11000);

        HashMap hm = new HashMap();
        hm.put(123, mb1);
        hm.put(124, mb2);
        hm.put(125, mb3);
        hm.put(126, mb4);
        hm.put(127, mb5);

        System.out.println(hm);
        System.out.println(hm.get(124));
        System.out.println(hm.entrySet());
        System.out.println(hm.keySet());
        //-124604961
//-124604961
        //-48151680
        System.out.println(hm.hashCode());
        System.out.println(hm.values().iterator().hasNext());

        Set entrySetValueOfMobile = hm.entrySet();
        Iterator iterationMobileHashMap = entrySetValueOfMobile.iterator();

        while (iterationMobileHashMap.hasNext()) {
            Map.Entry entry = (Map.Entry) iterationMobileHashMap.next();
            Object ob = entry.getValue();
            Mobile mobile = (Mobile) ob;
            if (entry.getKey().equals(124)) {
                System.out.println(mobile.getPrice());
                mobile.setPrice(27000);
                System.out.println(mobile.getPrice());
}
        }
        System.out.println(entrySetValueOfMobile);
    }
}

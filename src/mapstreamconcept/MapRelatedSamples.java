package mapstreamconcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapRelatedSamples {

    public static void main(String[] args) {

        HashMap hm = new HashMap();
        hm.put("appa express", 5000);
        hm.put("amma express", 4000);
        hm.put("sab express", 2000);
        hm.put("shylu express", 1000);
        hm.put("janani express", 3000);
        hm.put("sudar express", 4000);

//        System.out.println(hm);
//        System.out.println(hm.entrySet());
//        System.out.println(hm.get("sab express"));
        Set s = hm.entrySet();
        System.out.println("Before Changing Value:" +s);

        Iterator iteratorhmvalues = s.iterator();

        while (iteratorhmvalues.hasNext()) {
            Object o = iteratorhmvalues.next();
            Map.Entry e = (Map.Entry) o;
            Object expressName = e.getKey();
            Object expressValue = e.getValue();
            if(expressValue.equals(4000)){
                e.setValue(4500);
            }
        }
        System.out.println("Before Changing Value:" +s);
    }
}

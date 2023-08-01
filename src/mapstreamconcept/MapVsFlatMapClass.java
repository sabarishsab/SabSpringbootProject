package mapstreamconcept;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapVsFlatMapClass {


    public static void main(String[] args) {

        List<Customer> customer = EKartDataBase.getEmployeeDatas();

        List<String> customerMailID = customer.stream().map(customers -> customers.getEmail()).collect(Collectors.toList());
        System.out.println(customerMailID);

        List<String> customerMailID1 = customer.stream().map(customer1 -> customer1.getName()).collect(Collectors.toList());
        System.out.println(customerMailID1);

//        List<String> customerMailID2 = customer.stream().filter(customer2 -> customer2.getName().startsWith("s")).collect(Collectors.toList());
//        System.out.println(customerMailID2);
        List<List<String>> customerMailID2 = customer.stream().map(customers -> customers.getPhoneNumber()).collect(Collectors.toList());
        System.out.println(customerMailID2);

        List<String> customerMailID3 = customer.stream().flatMap(customers -> customers.getPhoneNumber().stream()).collect(Collectors.toList());
        System.out.println(customerMailID3);
        System.out.println();
        System.out.printf("");
        System.out.println("MapVsFlatMapClass.main");
        System.out.println("args = " + Arrays.toString(args));
        System.out.println("customerMailID3 = " + customerMailID3);
        System.out.println("customerMailID3 = " + customerMailID3);

        Optional<String> optionalvalue = Optional.empty();
        System.out.printf("");
//                Optional<String> optionalname = Optional.ofNullable(customer.get());
//                System.out.printf(optionalname.);
    }
}

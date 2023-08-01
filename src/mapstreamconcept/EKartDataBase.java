package mapstreamconcept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EKartDataBase {

    public static List<Customer> getEmployeeDatas(){

        return Stream.of(
                new Customer(1,"sabarish","sabrishsab93@gmail.com", Arrays.asList("12345678", "12345678")),
                new Customer(1,"Amma","sabrishsab93@gmail.com", Arrays.asList("12345678", "12345678")),
                new Customer(1,"Appa","sabrishsab93@gmail.com", Arrays.asList("12345678", "12345678")),
                new Customer(1,"Anna","sabrishsab93@gmail.com", Arrays.asList("12345678", "12345678"))
        ).collect(Collectors.toList());
    }
}

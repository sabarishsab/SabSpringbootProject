package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamingEmployeeData {
    public static List<Employee> getEmployeeList(String values) {

        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(1, "sabarish", "developer" , 75000));
        list.add(new Employee(2, "sudar", "developer" , 45000));
        list.add(new Employee(3, "appa", "developer" , 100000));
        list.add(new Employee(4, "shylu", "developer" , 75000));


        return (values.equalsIgnoreCase("sab")) ?
                list.stream().filter(sal -> sal.getSalary() > 50000).collect(Collectors.toList()) :
                list.stream().filter(sal -> sal.getSalary() <= 50000).collect(Collectors.toList());

    }

    public static void main(String[] args) {
        System.out.println(getEmployeeList("sas"));

    }
}

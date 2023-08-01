package set;

import java.util.Objects;

public class Employee {

    String name;
    int id;
    String Department;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        Department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", Department='" + Department + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

package mapstreamconcept;

import java.util.Objects;

public class Mobile {

    private int version;
    private String name;
    private int price;

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public boolean setPrice(int price) {
        this.price = price;
        return false;
    }

    public Mobile() {
    }

    public Mobile(int version, String name, int price) {
        this.version = version;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "version=" + version +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mobile mobile)) return false;
        return version == mobile.version && price == mobile.price && Objects.equals(name, mobile.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, name, price);
    }
}

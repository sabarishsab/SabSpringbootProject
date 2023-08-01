package StreamingExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IceCreamShop {

    public static void main(String[] args) {
        List<Menu> listOfIceCream = Arrays.asList(
                new Menu("Vanilla", 120, "Sathish", 1234),
                new Menu("Strawberry", 140, "Kumar", 1234),
                new Menu("Chocolate", 150, "Santhosh", 1134),
                new Menu("ButterScotch", 120, "Thala", 1034)
                );

        List<String> sab = listOfIceCream.stream()
                //.filter(i -> i.getServingTime() == 1134)
                .map(s -> s.getIceCreamFlavour())
                .collect(Collectors.toList());
        System.out.println(sab);
    }


}

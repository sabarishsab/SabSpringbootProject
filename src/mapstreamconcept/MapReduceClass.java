package mapstreamconcept;



import java.util.Arrays;
import java.util.List;

public class MapReduceClass {



    public static void main(String[] args) {
        List<String> sabName = Arrays.asList("saba", "sabarish", "sajks");

        String longString = sabName
                .stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();

        System.out.println(longString);
    }

}

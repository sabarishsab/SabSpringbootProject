package InterviewDOT;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class CountTheCharacters {
    static Set<Character> vowels = new HashSet<>();

        static {
            vowels.add('a');
            vowels.add('A');
            vowels.add('e');
            vowels.add('E');
            vowels.add('i');
            vowels.add('I');
            vowels.add('o');
            vowels.add('O');
            vowels.add('u');
            vowels.add('U');
        }

    public static void main(String[] args) {
            String sab = "I love programming people";
            long vowelsCount = sab.chars()
                    .mapToObj(character -> (char) character)
                    .filter(character -> vowels.contains(character))
                    .count();
        System.out.println(vowelsCount);


    }
}

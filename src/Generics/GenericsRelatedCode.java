package Generics;

public class GenericsRelatedCode {

    public static void main(String[] args) {

        Integer[] intArray = {1,2,3,4,5};
        Character[] charArray = {'a','b','c','d'};
        Double[] doubleArray = {2.2,4.4,5.5};
        String[] stringArray = {"a" , "b" , "c" , "m"};
        iterationArray(intArray);
        characterArray(charArray);

    }
    public static <Thing> void iterationArray(Thing[] array){

        for (Thing g :
                array) {
            System.out.print(g + " ");
        }
        System.out.println();
    }

    public static <S> void characterArray(S[] array){

        for (S g :
                array) {
            System.out.print(g + " ");
        }
    }
}

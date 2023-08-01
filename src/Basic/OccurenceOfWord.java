package Basic;

public class OccurenceOfWord {
    public static void main(String[] args) {
        String occurenceOfWord = "I Love My India Love India";
        String word = "india";
        int count = occurence(occurenceOfWord,word);
        System.out.println("Count of the Love word in sentence is :" + count);
    }

    private static int occurence(String occurenceOfWord, String word) {

        String temp[] = occurenceOfWord.toLowerCase().split(" ");
        int count = 0;
        for (int i = 0; i < temp.length; i++) {
            if(word.equals(temp[i])){
                count++;
            }

        }
        return count;
    }

}

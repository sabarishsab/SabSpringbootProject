package Multithreading;

public class Multithreading
{
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
        ThreadConcepts threadConcepts = new ThreadConcepts(i);
        threadConcepts.start();
        }

        ThreadTesting threads = new ThreadTesting();
       //threads.start();

    }
}

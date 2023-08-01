package Multithreading;

public class ThreadConcepts extends Thread {

    int threadNum;
    public ThreadConcepts(int threadNum){
        this.threadNum=threadNum;
    }

    public void run(){
        for (int i = 0; i < 5 ; i++ ) {
            System.out.println(i+ " is from thread " + threadNum);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

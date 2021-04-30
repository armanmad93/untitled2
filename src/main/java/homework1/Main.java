package homework1;

public class Main {
    public static void main(String[] args) {

        ThreadA threadA = new ThreadA();
        Thread thread = new Thread(threadA);

        thread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        threadA.stop();
    }
}

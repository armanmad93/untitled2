package homework1;

public class ThreadA implements Runnable {

    boolean bool = true;

    @Override
    public void run() {
        int count = 0;
        while (bool) {
            System.out.println("Hello. " + count++);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public void stop() {
        bool = false;
    }

}

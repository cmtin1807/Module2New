package ss18_Threading.bai_tap.Hien_thi_chan_le;

public class OddThread implements Runnable {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 1) {
                    System.out.println(threadName + ": " + i);
                    Thread.sleep(10);
                }
            }
        }
        catch (InterruptedException e) {
            System.out.println("OddThread interrupted");
        }
    }
}

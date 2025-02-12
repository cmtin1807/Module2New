package ss18_Threading.bai_tap.Hien_thi_chan_le;

public class EvenThread implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        try{
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(threadName + ": " + i);
                Thread.sleep(15);
            }
        }
        }
        catch(InterruptedException e){
            System.out.println("Even Thread Interrupted");
        }
    }
}

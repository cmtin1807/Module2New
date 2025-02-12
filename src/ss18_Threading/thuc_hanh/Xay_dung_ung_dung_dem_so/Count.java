package ss18_Threading.thuc_hanh.Xay_dung_ung_dung_dem_so;

public class Count implements Runnable {
    private Thread thread;

    public Count() {
        thread = new Thread(this, "My runnable thread");
        System.out.println("My thread created" + thread);
        thread.start();
    }
    public Thread getMyThread() {
        return thread;
    }
    @Override
    public void run() {
        try{
            for(int i=1;i<=10;i++){
                System.out.println("Printing the count " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("My thread interrupted");

        }
    }
    public static void main(String[] args) {
        Count count = new Count();
        try {
            while (count.getMyThread().isAlive()) {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is over");
    }
}

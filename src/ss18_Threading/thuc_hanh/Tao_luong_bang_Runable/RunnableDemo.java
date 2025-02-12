package ss18_Threading.thuc_hanh.Tao_luong_bang_Runable;

public class RunnableDemo implements Runnable {
    private Thread thread;
    private final String threadName;

    public RunnableDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
    }


    @Override
     public void run() {
        synchronized (RunnableDemo.class) {
            System.out.println("Running " + threadName);

            System.out.println("Running " + threadName);
            try {
                for (int i = 4; i > 0; i--) {
                    System.out.println("Thread: " + threadName + ", " + i);
                    // Dừng vòng lặp trong 50 ms
                    Thread.sleep(50);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread " + threadName + " interrupted.");
            }
            System.out.println("Thread " + threadName + " exiting.");
        }
    }
        public void start () {
            System.out.println("Starting " + threadName);
            if (thread == null) {
                thread = new Thread(this, threadName);
                thread.start();
            }
        }

    public static void main(String[] args) {
        System.out.println("Main thread running... ");

        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-1-HR-Database");
        runnableDemo1.start();

        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-Send-Email");
        runnableDemo2.start();

        System.out.println("Main thread stopped!!! ");
    }
}

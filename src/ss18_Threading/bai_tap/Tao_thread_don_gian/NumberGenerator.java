package ss18_Threading.bai_tap.Tao_thread_don_gian;

public class NumberGenerator implements Runnable {

    @Override
     public void run() {
        synchronized (NumberGenerator.class) {
            String threadName = Thread.currentThread().getName();
            int hashCode = this.hashCode();
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread: " + threadName
                            + " (NumberGenerator hashCode: " + hashCode + ") - Số: " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread: " + threadName + "Interrupted.");
            }
        }
    }
    public static void main(String[] args) {
        NumberGenerator generator1 = new NumberGenerator();
        NumberGenerator generator2 = new NumberGenerator();
        Thread thread1 = new Thread(generator1,"Generator-Thread-1");
        Thread thread2 = new Thread(generator2,"Generator-Thread-2");
        thread1.start();
        thread2.start();

    }
}

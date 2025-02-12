package ss18_Threading.bai_tap.Tim_so_nguyen_to;

public class OptimizedPrimeFactorization implements Runnable {


    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        for (int i = 2; i <= 1000; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(threadName + " " + i);
            }
        }

    }
}

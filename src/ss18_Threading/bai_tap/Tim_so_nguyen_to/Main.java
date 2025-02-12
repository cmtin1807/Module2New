package ss18_Threading.bai_tap.Tim_so_nguyen_to;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();
        Thread threadLazyPrimeFactorization = new Thread(lazyPrimeFactorization,"LazyPrimeFactorization: ");
        Thread threadOptimizedPrimeFactorization = new Thread(optimizedPrimeFactorization,"OptimizedPrimeFactorization: ");
        threadLazyPrimeFactorization.start();
        threadOptimizedPrimeFactorization.start();
    }
}

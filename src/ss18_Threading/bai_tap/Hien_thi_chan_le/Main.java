package ss18_Threading.bai_tap.Hien_thi_chan_le;

public class Main {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        Thread odd = new Thread(oddThread, "Number Odd");
        Thread even = new Thread(evenThread, "Number Even");
        odd.start();
        even.start();

    }
}

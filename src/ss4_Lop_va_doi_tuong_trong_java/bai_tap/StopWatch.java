package ss4_Lop_va_doi_tuong_trong_java.bai_tap;

public class StopWatch {
    private long startTime;
    private long stopTime;

    public StopWatch() {
        startTime = System.nanoTime();
    }

    public void start() {
        startTime = System.nanoTime();
    }

    public void stop() {
        stopTime = System.nanoTime();
    }

    public long getElapsedTime() {
        return (stopTime - startTime) / 1_000_000; // Chuyển từ nano giây sang mili giây
    }

    public static void main(String[] args) {
        int[] arr = new int[100000];

        // Tạo mảng ngẫu nhiên với các giá trị từ 0 đến 99999
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }

        StopWatch stopwatch = new StopWatch();
        stopwatch.start();

        selectionSort(arr); // Sắp xếp chọn

        stopwatch.stop();
        System.out.println("Thời gian thực thi của thuật toán sắp xếp chọn là: " + stopwatch.getElapsedTime() + " ms");
    }

    // Thuật toán sắp xếp chọn (Selection Sort)
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Giả sử phần tử i là nhỏ nhất

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Cập nhật vị trí của phần tử nhỏ nhất
                }
            }

            // Đổi chỗ phần tử nhỏ nhất với phần tử đầu tiên của đoạn chưa sắp xếp
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

package ss3_Mang.thuc_hanh;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n--- Temperature Converter ---");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Fahrenheit: ");
                    double fahrenheit = sc.nextDouble();
                    double celsius = (5.0 / 9) * (fahrenheit - 32);
                    System.out.println("Celsius: " + celsius);
                    break;

                case 2:
                    System.out.print("Enter Celsius: ");
                    double celsiusInFahrenheit = sc.nextDouble();
                    double fahrenheitResult = (celsiusInFahrenheit * 9 / 5) + 32;
                    System.out.println("Fahrenheit: " + fahrenheitResult);
                    break;

                case 0:
                    System.out.println("Exiting program...");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please enter 0, 1, or 2.");
            }
        }

        sc.close();
    }
}

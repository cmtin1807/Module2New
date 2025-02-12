package ss9_Automated_Testing_TDD.bai_tap.tinh_ngay_tiep_theo;

public class NextDate {
    public static String getNextDate(int date, int month, int year) {
        if (date == finalDateOfMonth(month, year)) {
            date = 1;
            if (month == 12){
                month = 1;
                year++;
            }
            else {
                month++;
            }
        }
        else {
            date++;
        }
        return date + "/" + month + "/" + year;

    }

    public static int finalDateOfMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                throw new IllegalArgumentException("Tháng không hợp lệ: " + month);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}

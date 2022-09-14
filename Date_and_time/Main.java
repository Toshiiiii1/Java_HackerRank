package Date_and_time;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static String getDay(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        String dayOfWeek = date.getDayOfWeek().toString();
        return dayOfWeek;
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day, month, year;
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();
        String result = getDay(day, month, year);
        System.out.println(result);
    }
}
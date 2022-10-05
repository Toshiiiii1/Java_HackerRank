package Currency_Formatter;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class Main {
	public static void main(String[] args) {
        // chuong trinh se chay chinh xac dap an o phien ban Java 8
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat nF = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nF.format(payment);

        nF = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = nF.format(payment);

        nF = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nF.format(payment);

        nF = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nF.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
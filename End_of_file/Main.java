package JavaEx_github.End_of_file;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (sc.hasNext()) {
            System.out.printf("%d %s\n", i++, sc.nextLine());
        }
    }
}
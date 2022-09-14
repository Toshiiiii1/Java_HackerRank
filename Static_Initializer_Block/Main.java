package Static_Initializer_Block;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B, H;
        B = sc.nextInt();
        H = sc.nextInt();

        if (B <= 0 || H <= 0)
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        else
            System.out.println(B*H);
    }
}
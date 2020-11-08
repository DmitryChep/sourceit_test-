package l2;

import l2.math.Gcd;
import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {
        Gcd mathGcd = new Gcd();

        Scanner enterNum = new Scanner(System.in);
        System.out.print("Hello! Please enter in any numbers: ");
        int a = enterNum.nextInt();
        System.out.print("Yes, and next number: ");
        int b = enterNum.nextInt();
        System.out.println("Result: " + mathGcd.gcd(a, b));
    }
}
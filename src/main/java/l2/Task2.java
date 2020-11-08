package l2;

import java.util.Scanner;
import l2.math.SumNumerals;

public class Task2 {
    public static void main(String[] args) {
        SumNumerals sumNum = new SumNumerals();

        Scanner enterNum = new Scanner(System.in);
        System.out.print("Hello! Please enter in any numbers: " );
        int num = enterNum.nextInt();
        System.out.println("Result: " + sumNum.sumNumbers(num));
    }
}

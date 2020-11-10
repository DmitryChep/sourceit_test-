package l2;

import java.util.Scanner;
import l2.math.PrimeCheck;

public class Task3 {
    public static void main(String[] args) {
        PrimeCheck primeCheck = new PrimeCheck();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter in some number: ");
        int num = scanner.nextInt();
        if(num == 1) {
            System.out.println("This number is neither a prime number nor a composite number.");
        } else {
            if(primeCheck.check(num)) {
                System.out.println("This number is prime number");
            } else {
                System.out.println("This number is a composite number");
            }
        }
    }
}

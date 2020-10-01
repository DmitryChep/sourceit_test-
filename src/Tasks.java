import java.util.Scanner;

public class Tasks {
    public static void main (String[] args) {

        Tasks tasks = new Tasks();

        //System.out.println(tasks.remainder(678, 10));

        Scanner enterNum = new Scanner(System.in);
        System.out.println("Hallo! Please enter in eny numbers :" );
        int number = enterNum.nextInt();
        int num = number;
        System.out.println("Thanks! data processing...");
        System.out.println( "Result: "+ tasks.sumNumbers(num));
        System.out.println("Have a nice day!");

    }
    //Найти НОД двух целых положительный чисел. Алгоритм Евклида.
    public int gcd(int a,int b) {
        int r ;
        while (b != 0){
            r = a % b;
            a = b;
            b = r;
        }
        return  a;

    }

    public int remainder(int a ,int  b) {
        int  c = a % b;
        return c;

    }

    public int sumNumbers(int num) {
        int r;
        int t = 10;
        int sum = 0;
        while (num != 0) {
            r = num % t;
            num = num / t;
            sum = sum + r;
        }
        return sum ;


    }

}


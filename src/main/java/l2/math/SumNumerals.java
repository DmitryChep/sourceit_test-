package l2.math;

public class SumNumerals {
    public int sumNumbers(int num) {
        int r;
        int t = 10;
        int sum = 0;
        while (num != 0) {
            r = num % t;
            num = num / t;
            sum = sum + r;
        }
        return sum;
    }
}


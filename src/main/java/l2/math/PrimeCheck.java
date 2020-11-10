package l2.math;

public class PrimeCheck {

    public boolean check(int num) {
        boolean a = true, b = false;
        for(int i = 2; i < num; i++) {
            int r = num % i;
            if(r == 0) {
                return b;
            }
        }
        return a;
    }
}

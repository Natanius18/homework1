public class NumberOfDecimalDigits {
    public static int Digits(long n) {
        int res = 1;
        while(n >= 10) {
            res++;
            n /= 10;
        }
        return res;
    }
}

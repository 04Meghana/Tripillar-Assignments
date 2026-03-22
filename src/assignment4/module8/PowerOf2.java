package assignment4.module8;
public class PowerOf2 {
    public static void main(String[] args) {
        int n = 15;

        boolean isPowerOfTwo = (n > 0) && ((n & (n - 1)) == 0);

        System.out.println(isPowerOfTwo);
    }
}

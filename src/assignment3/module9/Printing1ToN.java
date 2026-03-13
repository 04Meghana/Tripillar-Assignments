package assignment3.module9;

public class Printing1ToN {
    public static int sum(int n){
        if (n == 0) {
            return 0;
        }
        return n + sum(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}

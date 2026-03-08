package module3;

public class Factorial {
    static int factorial(int n)
    {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args)
    {
        int num = 3;
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }
}


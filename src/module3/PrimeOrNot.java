package module3;

public class PrimeOrNot {
    public static void main(String[] args) {
        int n = 2;
        checkPrime (n);
    }
    private static void checkPrime (int n)
    {
        int count = 0;
        if (n < 2)
        {
            System.out.println ("The given is number " + n + " is not prime number");
            System.exit (0);
        }
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
                count += 1;
        }

        if (count > 2)
            System.out.println ("The given is number " + n + " is not prime number");
        else
            System.out.println ("The given is number " + n + " is prime number");
    }
}

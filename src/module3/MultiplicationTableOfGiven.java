package module3;

import java.util.Scanner;

public class MultiplicationTableOfGiven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value : ");
        int n = sc.nextInt();
        int j;
        for (j=1; j<=10; j++){
            System.out.println(n + "x" + j + "=" + n*j );
        }
    }
}

package module3;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:");
        int n = scanner.nextInt();
        if ((n & 1) == 0
        ){
            System.out.println(n + " is Even");
        }else {
            System.out.println(n + " is odd");
        }
    }
}


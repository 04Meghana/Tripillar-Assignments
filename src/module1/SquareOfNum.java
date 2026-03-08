package module1;

import java.util.Scanner;

public class SquareOfNum {
    public static void main(String[] args) {
        int number, square;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the Number : ");
        number = sc.nextInt();
        square = number * number;
        System.out.println("\n The Square of a Given Number is "  + square);
    }
}


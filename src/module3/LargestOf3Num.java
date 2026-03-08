package module3;

public class LargestOf3Num {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 4;
        int num3 = 1;
        if (num1 >= num2 && num1 >= num3)
            System.out.println (num1 + " is the greatest");
        else if (num2 >= num1 && num2 >= num3)
            System.out.println (num2 + " is the greatest");
        else if (num3 >= num1 && num3 >= num2)
            System.out.println (num3 + " is the greatest");
    }
}



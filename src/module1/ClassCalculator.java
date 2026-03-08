package module1;

public class ClassCalculator {
    void add(int a, int b) {
        System.out.println("Addition answer is: " + (a + b));
    }
    void subtract(int a, int b) {
        System.out.println("Subtraction answer is: " + (a - b));
    }
    public static void main(String[] args) {
        ClassCalculator add = new ClassCalculator();
        ClassCalculator subtract = new ClassCalculator();
        add.add(1, 2);
        subtract.subtract(2, 1);
    }
}

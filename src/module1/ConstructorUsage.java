package module1;

public class ConstructorUsage {
    String name;

    ConstructorUsage(String n) {
        name = n;
    }

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        ConstructorUsage p = new ConstructorUsage("Meghana");
        p.display();
    }
}

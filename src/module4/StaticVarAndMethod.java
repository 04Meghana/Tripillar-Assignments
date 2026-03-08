package module4;

public class StaticVarAndMethod {
    static int count = 0;
    StaticVarAndMethod() {
        count++;
    }
    static void display() {
        System.out.println("Count: " + count);
    }
    public static void main(String[] args) {
        new StaticVarAndMethod();
        new StaticVarAndMethod();
        new StaticVarAndMethod();
        StaticVarAndMethod.display();
    }
}


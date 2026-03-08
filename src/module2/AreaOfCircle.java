package module2;

public class AreaOfCircle {
    static void areaOfCircle(int n){
        int r = n;
        System.out.println(Math.PI*(r^2));
    }
    public static void main(String[] args) {
        areaOfCircle(3);
    }
}


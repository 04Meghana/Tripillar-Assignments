package module2;

public class CelToFah {
    static void celsToFah(double n){
        double result = (1.8*n) + 32 ;
        System.out.println(result);
    }
    public static void main(String[] args) {
        celsToFah(40);
    }
}



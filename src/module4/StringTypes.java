package module4;

public class StringTypes {
    public static void main(String[] args) {

        String s = "Hello";
        s= s + " World";
        System.out.println("String: " + s);

        java.lang.StringBuilder sb = new java.lang.StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb.toString());

        StringBuffer sf = new StringBuffer("Hello");
        sf.append(" World");
        System.out.println("StringBuffer: " + sf);
    }
}

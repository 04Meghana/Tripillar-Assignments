package assignment3.module8;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String str = "Mathematics";
        char ch = 't';
        String result =" ";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ch) {
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}

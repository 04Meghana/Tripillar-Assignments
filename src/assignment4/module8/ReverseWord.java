package assignment4.module8;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "Meghana";
        String[] words = str.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}
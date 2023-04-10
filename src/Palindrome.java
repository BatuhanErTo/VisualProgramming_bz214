import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text");
        String text = input.nextLine();
        if (isPalindrome(text)) {
            System.out.println("is palindrome");
        } else {
            System.out.println("is not palindromee");
        }
    }
    private static boolean isPalindrome(String text){
        String filteredText = filterText(text);
        String reversedText = reverseText(filteredText);
        return filteredText.equals(reversedText);
    }
    private static String reverseText(String text){
        StringBuilder reversedText = new StringBuilder(text);
        reversedText.reverse();
        return reversedText.toString();
    }
    private static String filterText(String text){
        StringBuilder filteredText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetterOrDigit(text.charAt(i))) {
                filteredText.append(text.charAt(i));
            }
        }
        return filteredText.toString();
    }

}

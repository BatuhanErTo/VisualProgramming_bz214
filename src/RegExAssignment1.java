import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExAssignment1 {
    public static void main(String[] args) {
        String input = "bataer57@gmail.com";
        System.out.println(checkEmail(input));
    }
    private static boolean checkEmail(String input){
        String regex1 = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$";
        String regex2 = "^[\\w.-]+@[\\w]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}

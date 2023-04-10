import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExAssignment2 {
    public static void main(String[] args) {
        String input = "https://www.geeksforgeeks.org";
        String regex = "^https://www\\.[\\w.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        System.out.println(matcher.matches());
    }
}

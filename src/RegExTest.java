import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {
    public static void main(String[] args) {
        /*
        String s = "in 1991 Oak released\tin 1996 it is renamed as java, Java JDK 1.0 released in 1996";
        System.out.println(s);
        System.out.println(s.replaceAll("^in","at"));//köşeli parantezler olmadığı zaman ^ işareti en baştakini değiştirir
        //bir sonraki örnek öncekinin tam tersi mantık
        System.out.println(s.replaceAll("1996$","**"));
        System.out.println(s.replaceAll("[Jj]","X"));
        System.out.println(s.replaceAll("\\d","X"));// iki slash \\ kullanıldı dikkat

        String[] parts = s.split("\\s",5);
        for (String part:parts) {
            System.out.println(part);
        }

         */

        /*
        String text = "A sailor went to sea sea to what he could see see seee";
        System.out.println(text.replaceAll("se?","x"));
        System.out.println(text.replaceAll("se*","z"));
        System.out.println(text.replaceAll("se+","w"));
        System.out.println(text.replaceAll("se{2,3}","*"));
        System.out.println(text.replaceAll("se{2,}","*"));
        System.out.println(text.replaceAll("se{2}","*"));
        System.out.println(text.replaceAll("se+[a,e]{1,2 }","w"));

         */
        String html = "<h1>My heading</h1><h2>Sub heading</h2><p>This is a paragraph</p><h2>Summary</h2><p>Here is the summary</p>";
        System.out.println(html.toString());

        String regex = "<h2>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);
        //System.out.println(matcher.matches());// if it matches completely then returns true
    }
}

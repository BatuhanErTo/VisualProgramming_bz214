import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {

        String s = "in 1991 Oak released\tin 1996 it renamed as Java" +
                "JDK 1.0 released in 1996";
        System.out.println(s.replaceAll("in","at"));
        System.out.println(s.replaceAll("^in","at"));
        System.out.println(s.replaceAll("1996$","YY"));
        System.out.println(s.replaceAll("java|Oak","Python"));
        System.out.println(s.replaceAll("\\d","y"));
        System.out.println(s.replaceAll("[0-9]","y"));
        System.out.println(s.replaceAll("\\s","-"));


        StringBuilder html = new StringBuilder("<h1>My heading</h1>");
        html.append("<h2>Sub heading</h2>");
        html.append("<p>This is a paragraph</p>");
        html.append("<h2>Summary</h2>");
        html.append("<p>Here is the summary</p>");
        System.out.println(html.toString());
        /*
        String regex = "<h2>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);
        while(matcher.find())
            System.out.println(matcher.start() + " " + matcher.end());


        String regex = "(<h2>.*</h2>)";//greedy
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);
        while(matcher.find())
            System.out.println(matcher.group());


        String regex = "(<h2>.*?</h2>)";//lazy
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);
        while(matcher.find())
            System.out.println(matcher.group());


        String regex = "(<h2>)(.*?)(</h2>)";//lazy
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(html);
        while(matcher.find())
            System.out.println(matcher.group(2));

         */

        String list = "1:Fatih 2:Sevde 3:Ali 4:Mehmet 10:Bilge";
        String[] names = list.split("\\d+:");
        for (String name : names){
            System.out.println(name);
        }
    }
}

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {
    public static void main(String[] args) {
        String startingUrl = "https://www.erciyes.edu.tr";
        crawl(startingUrl);
    }
    public static void crawl(String startingURL){
        ArrayList<String> pendingURLS = new ArrayList<>();
        ArrayList<String> traversedURLS = new ArrayList<>();
        ArrayList<String> subURLS;
        pendingURLS.add(startingURL);
        while (!pendingURLS.isEmpty() && traversedURLS.size() < 50){
            String currentURL = pendingURLS.remove(0);
            System.out.println("Crawl: "+currentURL);
            traversedURLS.add(currentURL);
            subURLS = getSubURLS(currentURL);
            for(String subURL:subURLS){
                if(!pendingURLS.contains(subURL) && !traversedURLS.contains(subURL))
                    pendingURLS.add(subURL);
            }
        }
    }

    public static ArrayList<String> getSubURLS(String currentURL){
        ArrayList<String> list = new ArrayList<>();
        String regex = "(http|https)://(\\w+\\.)+(com|gov|org|edu|net)(\\.tr)?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        try {
            URL url = new URL(currentURL);
            Scanner scanner = new Scanner(url.openStream());
            String line;
            while ((scanner.hasNext())){
                line = scanner.nextLine();
                matcher = pattern.matcher(line);
                while (matcher.find()){
                    list.add(matcher.group());
                }
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}

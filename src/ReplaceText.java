import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) {
        try {
            replaceText("resource/source.txt","resource/target.txt","Course","Lecture");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void replaceText(String sourceName, String targetName, String oldStr, String newStr) throws FileNotFoundException {
        File sourceFile = new File(sourceName);
        File targetFile = new File(targetName);
        if(targetFile.exists())
            targetFile.delete();
        /*
        Scanner scanner = new Scanner(sourceFile);
        PrintWriter writer = new PrintWriter(targetFile);
        String line, newLine;
        while (scanner.hasNext()){
            line = scanner.nextLine();
            newLine = line.replace(oldStr,newStr);
            writer.println(newLine);
        }
        scanner.close();
        writer.close();

         */
        try(Scanner scanner = new Scanner(sourceFile);
            PrintWriter writer = new PrintWriter(targetFile);) {
            String line, newLine;
            while (scanner.hasNext()){
                line = scanner.nextLine();
                newLine = line.replace(oldStr,newStr);
                writer.println(newLine);
            }
        }

    }
}

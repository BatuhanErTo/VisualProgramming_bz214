public class StringCounter {
    public static void main(String[] args) {
        String word = "BZ214 Visual Programming 1";
        int letterCount = 0;
        int digitCount = 0;
        for (int i = 0; i < word.length() ; i++) {
            char c = word.charAt(i);
            if(Character.isAlphabetic(c))
                letterCount++;
            if(Character.isDigit(c))
                digitCount++;
        }
        System.out.println("Number of digits : " + digitCount);
        System.out.println("Number of letters : " + letterCount);
    }
}

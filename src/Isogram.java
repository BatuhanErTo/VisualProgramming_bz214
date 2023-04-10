public class Isogram {
    //Numara:1030510326
    //İsim:Batuhan Erol
    //eruvisual@gmail.com
    /*
    An isogram is a word that contains no repeating letters.
    For example, the word “visual” is an isogram
    because each letter in the word appears exactly once,
    but the word “programming” is not because ‘r’, ‘g’ and ‘m’ appear twice.
    Your job is to write a method to check whether a string is an isogram or not.
    */
    public static void main(String[] args) {
        System.out.println(isIsogram("Visual"));            //true
        System.out.println(isIsogram("Programming"));       //false
        System.out.println(isIsogram("JavA"));              //false
        System.out.println(isIsogram("uncopyrightable"));   //true
    }

    private static boolean isIsogram(String word){
        String loweWord = word.toLowerCase();
        for (int i = 0; i < loweWord.length(); i++){
            for(int j = i + 1; j < loweWord.length(); j++){
                if(loweWord.charAt(i) == loweWord.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }


}

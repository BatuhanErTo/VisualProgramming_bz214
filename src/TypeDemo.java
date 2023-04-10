public class TypeDemo {
    public static void main(String[] args) {
        double div = 2/3;
        System.out.println(div);

        float divf = 2/3;
        System.out.println(divf);

        float divfa = 2/3f;
        System.out.println(divfa);

        // float = 2.0/3.0; it gives an error because these values are double

        float correct = 2.0f/3.0f;
        System.out.println(correct);

        int k = 257;
        byte b = (byte) k;// it takes least sig. 8 bit
        System.out.println(b);

        int l = 254;
        byte f = (byte) k;//1111 1110 ikili tamamlayana dönüştüğünde  en anlamlı bit işaret biti oluyor bu yüzden negatife dönüşüp -2 oluyor
        System.out.println(b);//WHY IT GIVES NEGATIVE NUMBER AS A RESULT
    }
}

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        /*
        double[] scores = new double[5];
        for(int i = 0; i < scores.length; i++){
            scores[i] = Math.random();
        }

        System.out.println(Arrays.toString(scores));
        System.out.println(scores.toString());

        String[] list = {"Ali","Bilge","Demir","Ayse"};
        String[] names = new String[list.length];
        System.arraycopy(list,0,names,0,list.length);

        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(names));

        String[] list2 = {"Ali","Bilge","Ayse"};
        String[] names2 = Arrays.copyOf(list2,list2.length);
        String[] names3 = Arrays.copyOfRange(list2,0,2);

         */

        int[] scores = new int[3];
        scores[0] = 2;
        scores[1] = 4;
        scores[2] = 13;
        printArray(scores);

        //anonim array
        printArray(new int[]{1,3,5});
    }
    public static void printArray(int[] numbers){
        for (int number : numbers){
            System.out.println(number);
        }
    }
}

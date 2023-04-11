import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] list = {1, 2, 3};
        int n = 4;
        System.out.println(Arrays.toString(list));
        System.out.println(n);

        modifyArray(list);
        modifyVariable(n);

        System.out.println(Arrays.toString(list)); // passed by reference
        System.out.println(Arrays.copyOf(list,list.length));// list content will not be affected
        System.out.println(n);
    }
    public static void modifyArray(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            numbers[i] += 10;
        }
    }

    public static void modifyVariable(int number){
        number += 10;
    }
}

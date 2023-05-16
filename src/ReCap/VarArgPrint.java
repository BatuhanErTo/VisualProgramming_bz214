package ReCap;

public class VarArgPrint {
    static void print(int ... nums){
        System.out.println("ints: ");
        for(int i:nums)
            System.out.println(i + " ");
    }

    static void print(int num, int ... nums){
        System.out.println("int: " + num);
        System.out.println("ints: ");
        for (int i:nums)
            System.out.println(i + " ");
    }

    public static void main(String[] args) {
        //print(1);
    }
}

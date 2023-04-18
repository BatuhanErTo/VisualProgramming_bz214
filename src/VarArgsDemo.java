public class VarArgsDemo {
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(1,2));
        System.out.println(sum(12,47,458,-45,24));
        //System.out.println(min()); !ERROR!
        System.out.println(min(1));

        method(true,false);
        method2(10,54,78,96);
        //method(); !AMBIGUITY! in order to prevent this use the same approach in min method
    }
    public static void method2(int arg1){

    }
    public static void method2(int arg1, int arg2){

    }
    public static void method2(int arg1, int arg2, int... args){

    }
    public static void method(boolean arg, boolean... args){

    }
    public static void method(int arg, int... args){

    }
    public static int min(int firstNum,int... nums){
        int min = firstNum;
        for(int num:nums)
            if (min < num)
                min = num;
        return min;
    }
    public static int sum(int... nums){
        int sum = 0;
        for(int num:nums)
            sum += num;
        return sum;
    }
}

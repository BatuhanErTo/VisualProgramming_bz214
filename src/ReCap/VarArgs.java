package ReCap;

public class VarArgs {
    private static void sum(double ... nums){
        double sum = 0;
        for(double num:nums){
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }
    public static void main(String[] args) {
        sum();
        sum(10.5,11.5);
        sum(10,10.5);
    }
}

public class OverloadDemo {
    public static void main(String[] args) {
         max(10,12.0);
    }
    public static double max(double num1, double num2){
        if(num1 > num2)
            return num1;
        else
            return num2;
    }
    public static double max(int num1, int num2){
        if(num1 > num2)
            return num1;
        else
            return num2;
    }
}

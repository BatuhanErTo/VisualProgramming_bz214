package ReCap;
class Super{
    void method1(){
        System.out.println("sa");
    }
}

class Sub extends Super{
     void method2(){
        System.out.println("se");
    }
}
public class Test {
    public static void main(String[] args) {
        //Super x = new Super();
        //Super y = new Sub();
        //((Sub)y).method2();
        //sum();
        //sum1(1);
    }

    public static void sum(double ... args){
        System.out.println("fshfgdfh");
    }

    public static void sum1(int a, int... b){
        System.out.println("iki args");
    }
    public static void sum1(int... a){
        System.out.println("1 arg");
    }
}

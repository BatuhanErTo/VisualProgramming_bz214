package ReCap;

public class SubClass extends SuperClass{
    public SubClass() {
        System.out.println("Sub ");
    }


    public static void main(String[] args) {
        SuperClass obj = new SubClass();
    }
}

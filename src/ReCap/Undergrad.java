package ReCap;
class Person{
    public static void hello(){
        System.out.println("Hi");
    }
}
class Student extends Person{
    public static void hello(){
        System.out.println("Hi, I am a Student");
    }
}
public class Undergrad extends Student{
    public static void hello(){
        System.out.println("Hi, I am a Undergrad Student");
    }

    public static void main(String[] args) {
        Person someone = new Undergrad();
        someone.hello();

    }
}

class HidingTest {
    public static void main(String[] args) {
        SuperClass sc = new SubClass();
        sc.method();
        sc.staticMethod();//Derleme anında reference variable'ın neyse onu çalıştırır static methodlarda
        // tavsiye edilen kullanım => SuperClass.staticMethod()
    }
}
class SuperClass{
    public void method(){
        System.out.println("Instance method of Super");
    }
    public static void staticMethod(){
        System.out.println("Static method of super");
    }
}

class SubClass extends SuperClass{
    public void method(){
        System.out.println("Instance method of Sub");
    }
    public static void staticMethod(){
        System.out.println("Static method of Sub");
    }
}

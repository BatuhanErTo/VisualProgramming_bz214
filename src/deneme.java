class Base{
    public String printInfo() {
        return "This is Base";
    }
    public String printAll() {
        return "In Base: " + printInfo();
    }
}

class Derived extends Base{
    public String printInfo() {
        return "This is Derived";
    }
    public String printAll() {
        return "In Derived: " + printInfo() + super.printAll();
    }
}

public class deneme {
    public static void main(String[] args) {
        Base der = new Derived();
        System.out.println(der.printAll());
    }
}
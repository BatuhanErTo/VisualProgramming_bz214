package ReCap;
class TopClass{
    public TopClass(String str) {
        System.out.println("A" + str);
    }
}
public class BottomClass extends TopClass{
    public BottomClass(String str){
        super(str);
        System.out.println("B" + str);
    }

    public static void main(String[] args) {
        BottomClass bc = new BottomClass("C");
    }
}

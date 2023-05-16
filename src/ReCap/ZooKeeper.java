package ReCap;
class Mammal{
    public String name = "mammal ";
    public String makeNoise(){
        return "generic noise";
    }
}
class Lion extends Mammal{
    public String name = "lion ";
    public String makeNoise(){
        return "roar";
    }
}
public class ZooKeeper {
    public static void main(String[] args) {
        new ZooKeeper().go();
    }
    void go(){
        Mammal m = new Lion();
        System.out.println(m.name + m.makeNoise());
    }
}

import java.time.LocalDateTime;

public class BlockDemo {
    static double rootOfThree;
    int value;
    static { //static blok
        System.out.println("inside the static block");
    }
    {//instance blok
        System.out.println("inside the instance block");
    }

    public BlockDemo(){
        System.out.println("inside the constructor");
    }
}

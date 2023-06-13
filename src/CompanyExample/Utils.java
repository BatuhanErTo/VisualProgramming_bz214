package CompanyExample;

public class Utils {
    static void disallowNullArgs(Object... args){
        for(Object arg:args)
            if(arg==null)
                throw new IllegalArgumentException("Null arguments");
    }
    static void disallowZeroAndNegatives(double ... args){
        for(double arg:args)
            if(arg <= 0)
                throw new IllegalArgumentException("Zero or Negative Argument");
    }
}

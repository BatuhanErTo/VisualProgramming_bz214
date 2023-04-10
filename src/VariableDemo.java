public class VariableDemo {
    public static void main(String[] args) {
        // short,int,long,double,float,char,byte
        int e = 11;
        System.out.println(e);
        int f = 011;
        System.out.println(f);
        int g = 0xFA;
        System.out.println(g);
        int h = 0b0000_0101;
        System.out.println(h);

        double j = 12.54;
        float k = 12.54f;//suffix is compulsory, because literal of decimal digit is double
                        // so that it cannot convert 64bit double to 32bit float.
        double l = 12.3E30;

        int m = Integer.MAX_VALUE;
        int n = m + 1;
        System.out.println(n);

        int p = Math.addExact(m,1);
        System.out.println(p); // it will throw integer overflow which is
                                // ArithmeticException type.
    }
}
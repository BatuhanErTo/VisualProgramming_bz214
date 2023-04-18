public class Complex {
    private double real;
    private double imaginary;
    private static int numberOfComplex;

    // Constructors
    public Complex(){ //No-arg constructor
        this.real = 0.0;
        this.imaginary = 0.0;
        numberOfComplex++;
    }
    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
        numberOfComplex++;
    }

    // accessor methods
    public double getReal(){
        return real;
    }
    public double getImaginary(){
        return imaginary;
    }
    public static int getNumberOfComplex(){
        return numberOfComplex;
    }
    //mutator methods
    public void setReal(double real) {
        this.real = real;
    }
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    //instance methods
    public Complex plus(Complex other){
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new Complex(sumReal,sumImaginary);
    }

    public String toString(){
        return real + " + " + imaginary + "i";
    }
    @Override
    public boolean equals(Object obj) {
       if (obj == null)
           return false;
       if (obj == this)
           return true;
       if (!(obj instanceof Complex))
           return false;
       return this.real == ((Complex) obj).real && this.imaginary == ((Complex) obj).imaginary;
    }

}

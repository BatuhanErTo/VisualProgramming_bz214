public final class ImmutableComplex {
    private final double real;
    private final double imaginary;

    public ImmutableComplex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    //accessors with no corresponding mutators
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ImmutableComplex plus(ImmutableComplex c){
        return new ImmutableComplex(real + c.real, imaginary + c.imaginary);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(obj == this)
            return true;
        if(!(obj instanceof ImmutableComplex))
            return false;
        ImmutableComplex c = (ImmutableComplex) obj;
        return real == c.real && imaginary == c.imaginary;
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }


}

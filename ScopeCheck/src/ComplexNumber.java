public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }


    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public ComplexNumber add(ComplexNumber complexNum) {
        return new ComplexNumber(this.real + complexNum.real, this.imaginary + complexNum.imaginary);
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public ComplexNumber subtract(ComplexNumber complexNum) {
        return new ComplexNumber(complexNum.real - this.real, complexNum.imaginary - this.imaginary);
    }
}

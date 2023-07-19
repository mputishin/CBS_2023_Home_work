package cbs.dp.ua;

public class Example_8_N5 {
    public static void main(String[] args) {
        double a = 37, b = 49, c = 57;
        Calculatorr calc = Calculatorr.calculate(a, b, c);
        System.out.println( calc.a + " " +  calc.b + " " +  calc.c);

    }
}

class Calculatorr {
    double a, b, c;
    Calculatorr(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

        static Calculatorr calculate (double a, double b, double c) {
        a/=5; b/=5; c/=5;
        return  new Calculatorr(a, b, c);
    }
}

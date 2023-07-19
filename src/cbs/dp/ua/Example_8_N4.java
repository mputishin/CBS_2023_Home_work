package cbs.dp.ua;

public class Example_8_N4 {
    public static void main(String[] args) {
       double x = avarageNumber(129, 23, 45);
       double y = avarageNumber(24, 357, 147, 36);
       double z = avarageNumber(23, 37, 445, 31, 66);
       extremum(x, y, z);
    }

    static double avarageNumber (int a, int b, int c) {
        System.out.printf("%.2f",((double)(a+b+c)/3));
        return (double)(a+b+c)/3;
    }

    static double avarageNumber (int a, int b, int c, int d) {
        System.out.printf("\n" + "%.2f", (double) (a+b+c+d)/4);
        return (double) (a+b+c+d)/4;
    }

    static double avarageNumber (int a, int b, int c, int d, int e) {
        System.out.printf("\n" + "%.2f", (double) (a+b+c+d+e)/5);
        return (double) (a+b+c+d+e)/5;
    }

    static void extremum (double x, double y, double z) {
        double min, ave, max;
        if (x < y && x < z) {min = x; ave = y; max = z;}
        else if (y < z) {min = y; ave = x; max = z;}
        else {min = z; ave = x; max = z;}
        if (ave > max) {
            double tmp = max;
            max = ave;
            ave = tmp;
        }
        System.out.printf("\n" + "Минимальное число: " + "%.2f", min);
        System.out.printf("\n" + "Среднее число: " + "%.2f", ave);
        System.out.printf("\n" + "Максимальное число: " + "%.2f", max);
    }
}

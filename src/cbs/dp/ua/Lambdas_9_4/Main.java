package cbs.dp.ua.Lambdas_9_4;

public class Main {

    public static void main(String[] args) {

        Calculator<Integer> add = Integer::sum;
        Calculator<Integer> sub = (x, y) -> x - y;
        Calculator<Integer> mlt = (x, y) -> x * y;
        Calculator<Double> div = (x, y) -> (double) (x / y);

        int x = 27;
        int y = 12;

        System.out.println(add.calculate(x, y));
        System.out.println(sub.calculate(x, y));
        System.out.println(div.calculate(x, y));
        System.out.println(mlt.calculate(x, y));
    }
}

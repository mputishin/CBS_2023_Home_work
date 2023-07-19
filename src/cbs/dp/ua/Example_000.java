package cbs.dp.ua;

public class Example_000 {
    public static void main(String[] args) {

        int x = 10;
        int y = 12;
        int z = 3;

        System.out.println(x += y - x++ * z);
        System.out.println(z = --x - y * 5);
        System.out.println(y /= x + 5 % z);
        System.out.println(z = x++ + y * 5);
        System.out.println(x = y - x++ * z);
    }
}
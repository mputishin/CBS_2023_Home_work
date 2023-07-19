package cbs.dp.ua;

public class Example_001 {
    public static void main(String[] args) {

        justNumber(31);


    }

    static void justNumber ( int x) {
        int count = 0;
        for (int i=1; i<=x; i++) {
            if (x%i == 0) count++;
        }
        if (count > 2) {
            System.out.println(" Это число не есть простым");
        } else {
            System.out.println("Данное число простое");
        }
    }
}

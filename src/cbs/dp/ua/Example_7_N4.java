package cbs.dp.ua;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example_7_N4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите любое натуральное число: ");
        int x = Integer.parseInt(reader.readLine());
        NumbersCheck numb = new NumbersCheck(x);

        numb.numbChek(x);
    }
}

class NumbersCheck {
    private int x;

    NumbersCheck (int x) {
        this.x = x;
    }

    public void numbChek (int x) {
        int count = 0;
        for (int i=1; i<=x; i++) {
            if (x % i == 0) count++;
        }
        if (count > 2) {
            System.out.print("Это число не есть простым");
        } else {
            System.out.print("Это простое число");
        }
        if (x>0) {
            System.out.println(" и оно положительное.");
        } else if (x<0) {
            System.out.println(" и оно отрицательное.");
        } else System.out.println(" и это число 0.");
    }
}

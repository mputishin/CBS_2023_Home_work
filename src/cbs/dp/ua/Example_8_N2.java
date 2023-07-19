package cbs.dp.ua;

import java.util.Scanner;

public class Example_8_N2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Внесите сумму платежа: ");
        int pay = scn.nextInt();
        Bank.payment(pay);
    }
}

class Bank {
    static void payment (int pay) {
        int duty = 100;
        if (pay == duty) {
            System.out.println("Вы выплатили обязательный платёж в полном объёме.");
        } else if (pay < duty && pay >=0) {
            System.out.println("Ваша плата недостаточна, необходимо доплатить: " + (duty-pay));
        } else if (pay > duty && pay < 200) {
            System.out.println("Ваш платёж принят, в следующем месяце вам будет достаточно внести: " + (200-pay));
        } else if (pay < 700 && pay >= 200) {
            System.out.println("Ваш платёж принят, вам можно не оплачивать кредит: " +(pay/duty-1) + " месяц(ев).");
        } else if (pay == 700) {
            System.out.println("Вы полностью оплатили кредит");
        } else if (pay > 700) {
            System.out.println("Вы внесли слишком большую сумму, сумма не должна привышать 700");
        } else if (pay < 0) {
            System.out.println("Ха-ха-ха, очень смешно!");
        }
    }
}

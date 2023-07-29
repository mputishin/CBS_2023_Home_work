package cbs.dp.ua.lesson_3_6;

public class Main {
    public static void main(String[] args) {

        Printer print1 = new Printer();
        Printer print2 = new TestChildClass();

        print1.printer();
        print2.printer();
    }
}

package cbs.dp.ua.second_version;

public class Main {
    public static void main(String[] args) {

        Printer print1 = new Printer();
        Printer print2 = new TestChildClass();
        TestChildClass print3 = new TestChildClass();

        print1.printer();
        print2.printer();
        print3.printer(); // В общем, не работает!
    }
}

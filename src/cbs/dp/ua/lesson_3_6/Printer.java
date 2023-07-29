package cbs.dp.ua.lesson_3_6;

public class Printer {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";

    String message = " If color this message is black? This class is base. " +
            "If this message another color? This class is child  ";

    void printer() {
        System.out.println(message + this.getClass());
    }
}

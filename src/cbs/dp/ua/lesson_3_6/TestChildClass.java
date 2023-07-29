package cbs.dp.ua.lesson_3_6;

public class TestChildClass extends Printer {

    @Override
    void printer() {
            System.out.println(ANSI_GREEN + message  + this.getClass() + ANSI_RESET);
    }
}

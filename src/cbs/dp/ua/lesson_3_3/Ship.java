package cbs.dp.ua.lesson_3_3;

public class Ship extends Vechicle{

    int countPassengers;
    String port;

    public Ship (int countPassengers, String port) {
        super(20000000, 50, 1993);
        this.countPassengers = countPassengers;
        this.port = port;

    }
}

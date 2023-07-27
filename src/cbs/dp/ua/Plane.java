package cbs.dp.ua;

public class Plane extends Vechicle {

    int height;
    int countPassengers;

    public Plane (int height, int countPassengers) {
        super(200000, 600, 2015);
        this.height = height;
        this.countPassengers = countPassengers;
    }
}

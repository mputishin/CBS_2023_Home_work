package cbs.dp.ua;

public class Lessons_OOP_N3_3 {
    public static void main(String[] args) {

        Plane v1 = new Plane(10000, 200);
        Ship v2 = new Ship(5000, "Barcelona");
        Auto v3 = new Auto();
        System.out.println("Price: " + v1.price + " Speed: " + v1.speed + " Year: " + v1.year + " Height: " + v1.height + " Count passengers: " + v1.countPassengers);
        System.out.println("Price: " + v2.price + " Speed: " + v2.speed + " Year: " + v2.year + " Count passengers: " + v2.countPassengers + " Port: " + v2.port);
        System.out.println("Price: " + v3.price + " Speed: " + v3.speed + " Year: " + v3.year);

    }
}

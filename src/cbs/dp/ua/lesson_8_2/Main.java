package cbs.dp.ua.lesson_8_2;

public class Main {
    public static void main(String[] args) {

        //Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
        //Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280, Y=1024

        Monitor  monitor = new Monitor("Samsung",
                120, "AB1234567CD",120, 1024 );
        Device device = new Device("Samsung", 120, "AB1234567CD");

        System.out.println(monitor.toString());
        System.out.println(device.toString());

        System.out.println("------------------------------------------");

        System.out.println(monitor.equals(device));
        System.out.println(monitor.hashCode());

        System.out.println("------------------------------------------");

        System.out.println(device.equals(monitor));
        System.out.println(device.hashCode());
    }
}

package cbs.dp.ua;

public class Lessons_OOP_N2_4 {
    public static void main(String[] args) {
        SuperCar car1 = new SuperCar();
        SuperCar car2 = new SuperCar(2);
        SuperCar car3 = new SuperCar(3, 240);
        SuperCar car4 = new SuperCar(4, 250, 1600);
        SuperCar car5 = new SuperCar(1,230, 1450, "Blue");
        SuperCar car6 = new SuperCar( 240,1700,"Black");
        SuperCar car7 = new SuperCar(1360, "Green");
        SuperCar car8 = new SuperCar("White");
    }
}

class SuperCar {

    int age, speed, weight;
    String color;

    public SuperCar(int age) {
        this.age = age;
    }

    public SuperCar(int age, int speed) {
        this.age = age;
        this.speed = speed;
    }

    public SuperCar(int age, int speed, int weight) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
    }

    public SuperCar(int age, int speed, int weight, String color) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public SuperCar(int speed, int weight, String color) {
        this(8, speed, weight, color);

    }

    public SuperCar( int weight, String color) {
        this(4,230, weight, color);
    }

    public SuperCar(String color) {
        this(4, 280, 1450, color);
    }

    public SuperCar () {
        this(2, 270, 1670, "Grey");
    }
}

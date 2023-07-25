package cbs.dp.ua;

public class Lessons_OOP_N2_3 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2);
        Car car3 = new Car(3, 240);
        Car car4 = new Car(4, 250, 1600);
        Car car5 = new Car(1,230, 1450, "Blue");
        Car car6 = new Car(2, 240,"Black", 1700);
        Car car7 = new Car(3, "Green", 270, 1760);
        Car car8 = new Car("White", 7, 230,1900);
    }
}

class Car {

    int age, speed, weight;
    String color;

    public Car() {
    }

    public Car(int age) {
        this.age = age;
    }

    public Car(int age, int speed) {
        this.age = age;
        this.speed = speed;
    }

    public Car(int age, int speed, int weight) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int age, int speed, int weight, String color) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public Car(int age, int weight,  String color, int speed) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public Car(int age, String color, int weight, int speed) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

    public Car(String color, int age, int weight, int speed) {
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
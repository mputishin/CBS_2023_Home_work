public class Lessons_OOP_N2_2 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(3);
        Car car3 = new Car(5, "Red");

    }
}

class Car {
    int age;
    String color;

    public Car(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public Car(int age) {
        this.age = age;
    }

    public Car() {
    }
}

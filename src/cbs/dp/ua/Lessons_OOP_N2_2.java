package cbs.dp.ua;

public class Lessons_OOP_N2_2 {
    public static void main(String[] args) {
        Carr car1 = new Carr();
        Carr car2 = new Carr(3);
        Carr car3 = new Carr(5, "Red");

    }
}

class Carr {
    int age;
    String color;

    public Carr(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public Carr(int age) {
        this.age = age;
    }

    public Carr() {
    }
}

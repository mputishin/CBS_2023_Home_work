package cbs.dp.ua.lesson_6_2;

public class Main {

    enum Animals {
        LION(4), TIGER(3), ELEPHANT(12), WOLF(2), LEOPARD(5), BEAR(9);

        int age;

        Animals (int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Kind of animals: " + super.toString() + " age is: " + getAge();
        }
    }

    public static void main(String[] args) {

        Animals [] animals = Animals.values();
        for (Animals a : animals) {
            System.out.println(a);
        }
    }
}

package cbs.dp.ua.lesson_6_4;

public class Main {
    enum Vehicles {
        BMW(40000, "Red"), MERCEDES(300000, "Black"), AUDI(120000, "White"), TOYOTA(20000, "Green"), SUBARU(50000, "Silver"), OPEL(90000, "Grey");

        int price;
        String color;

        Vehicles (int price, String color ) {
            this.price = price;
            this.color = color;
        }

        public int getAge() {
            return price;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return "Model: " + super.toString() + " price: " + getAge() + " color: " + getColor();
        }
    }

    public static void main(String[] args) {

        Vehicles[] vehicles = Vehicles.values();
        for (Vehicles a : vehicles) {
            System.out.println(a);
        }
    }
}

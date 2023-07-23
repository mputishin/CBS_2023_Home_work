package cbs.dp.ua;

public class Lessons_OOP_N1_4 {
    public static void main(String[] args) {
        Address address = new Address(123456, "Ukraine", "Dnipro", "Korolyova", 23, 65);
        System.out.println("Индекс: " + address.getIndex());
        System.out.println("Страна: " + address.getCountry());
        System.out.println("Город: " + address.getCity());
        System.out.println("Улица: " + address.getStreet());
        System.out.println("Кавртира: " + address.getApartment());

    }
}

class Address {
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    private String country, city, street;
    private int index, house, apartment;

    public Address(int index, String country, String city, String street, int house, int apartment) {
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }
}


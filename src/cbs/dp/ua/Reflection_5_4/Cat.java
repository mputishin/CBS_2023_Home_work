package cbs.dp.ua.Reflection_5_4;

import java.lang.reflect.Field;

public class Cat {

    public static void methodAccessToAnimal () {
        try {
            Class<?> cl = Animal.class;
            Animal animal = new Animal();
            Field field1 = cl.getDeclaredField("age");
            Field field2 = cl.getDeclaredField("name");
            Field field3 = cl.getDeclaredField("height");
            field1.setAccessible(true);
            field2.setAccessible(true);
            field3.setAccessible(true);
            System.out.println("Private field value: " + field1.getInt(animal));
            System.out.println("Private field value: " + field2.get(animal));
            System.out.println("Private field value: " + field3.getDouble(animal));
            field1.setInt(animal, 5);
            field2.set(animal,"Baks");
            field3.setDouble(animal, 5.31);
            System.out.println("New private field value: " + field1.getInt(animal));
            System.out.println("New private field value: " + field2.get(animal));
            System.out.println("New private field value: " + field3.getDouble(animal));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

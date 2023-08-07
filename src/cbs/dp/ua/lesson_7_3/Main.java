package cbs.dp.ua.lesson_7_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Price good1 = new Price("Bread", "Varus", 18);
        Price good2 = new Price("Meal", "ATB", 94);

        Price[] goods = new Price[]{good1, good2};

        Price[] sortGoods = Price.sort(goods);

        for (Price good : sortGoods) {
            System.out.println(good.toString());
        }

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the name of the store whose price you want to see: ");
        try {
           String name = scn.nextLine();
           if (!(name.equals(good1.getNameShop())) && !(name.equals(good2.getNameShop()))) {
               throw new Exception("This store doesn't exist.");
           }
           if (name.equals(good1.getNameShop())) System.out.println(good1.toString());
           else if(name.equals((good2.getNameShop()))) System.out.println(good2.toString());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}

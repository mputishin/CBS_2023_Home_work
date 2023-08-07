package cbs.dp.ua.lesson_7_3;

import java.util.Arrays;

public class Price {

    private String nameGood;
    private String nameShop;
    private int cost;

    public String getNameGood() {
        return nameGood;
    }

    public String getNameShop() {
        return nameShop;
    }

    public int getCost() {
        return cost;
    }

    public Price(String nameGood, String nameShop, int cost) {
        this.nameGood = nameGood;
        this.nameShop = nameShop;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Name Shop: " + getNameShop() + " Name Good: " + getNameGood() + " Cost good: " + getCost() + " grn.";
    }

    public static Price[] sort (Price[] goods) {
        Price[] sortGoods = new Price[goods.length];
        String[] name = new String[goods.length];
        for (int i = 0; i < goods.length; i++) {
            name[i] = goods[i].getNameShop();
        }

        Arrays.sort(name);

        for (int i = 0; i < goods.length; i++) {
            for (int j = 0; j < goods.length; j++) {
                if (name[i].equals(goods[j].getNameShop())) {
                    sortGoods[i] = goods[j];
                }
            }
        }
        return sortGoods;
    }
}

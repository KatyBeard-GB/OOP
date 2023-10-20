package main_seminar1;

import java.util.ArrayList;

public class HomeworkMain {
    public static void main(String[] args) {
        HomeworkHotDrink hd1 = new HomeworkHotDrink("Americano", 65, 250, 95);
        HomeworkHotDrink hd2 = new HomeworkHotDrink("Green tea", 50, 350, 90);
        HomeworkHotDrink hd3 = new HomeworkHotDrink("Hot Chocolate", 190, 400, 95);
        HomeworkHotDrink hd4 = new HomeworkHotDrink("Espresso", 70, 30, 98);
        HomeworkHotDrink hd5 = new HomeworkHotDrink("Cappuccino", 100, 200, 87);
        HomeworkHotDrink hd6 = new HomeworkHotDrink("Espresso", 90, 90, 95);
        HomeworkHotDrink hd7 = new HomeworkHotDrink("Latte", 150, 300, 96);

        HomeworkHotDrinkVendingMachine hotDrinkVendingMachine1 = new HomeworkHotDrinkVendingMachine(new ArrayList<>());
        hotDrinkVendingMachine1.addHotDrink(hd1);
        hotDrinkVendingMachine1.addHotDrink(hd2);
        hotDrinkVendingMachine1.addHotDrink(hd3);
        hotDrinkVendingMachine1.addHotDrink(hd4);
        hotDrinkVendingMachine1.addHotDrink(hd5);

        System.out.println("Vending Machine #1");
        System.out.println("----------");
        for (HomeworkHotDrink hotDrink:
                hotDrinkVendingMachine1.getHotDrinkList()) {
            System.out.println(hotDrink);
        }

        HomeworkHotDrinkVendingMachine hotDrinkVendingMachine2 = new HomeworkHotDrinkVendingMachine(new ArrayList<>());
        hotDrinkVendingMachine2.addHotDrink(hd3);
        hotDrinkVendingMachine2.addHotDrink(hd4);
        hotDrinkVendingMachine2.addHotDrink(hd5);
        hotDrinkVendingMachine2.addHotDrink(hd6);
        hotDrinkVendingMachine2.addHotDrink(hd7);


        System.out.println("----------");
        System.out.println(hotDrinkVendingMachine1.getProduct("Americano"));
        System.out.println(hotDrinkVendingMachine1.getProduct("Latte"));
        System.out.println(hotDrinkVendingMachine1.getProduct("Espresso", 30, 98));
        System.out.println(hotDrinkVendingMachine1.getProduct("Espresso", 90, 95));
        System.out.println("----------");

        System.out.println("Vending Machine #2");
        System.out.println("----------");
        for (HomeworkHotDrink hotDrink:
                hotDrinkVendingMachine2.getHotDrinkList()) {
            System.out.println(hotDrink);
        }

        System.out.println("----------");
        System.out.println(hotDrinkVendingMachine2.getProduct("Americano"));
        System.out.println(hotDrinkVendingMachine2.getProduct("Latte"));
        System.out.println(hotDrinkVendingMachine2.getProduct("Espresso", 30, 98));
        System.out.println(hotDrinkVendingMachine2.getProduct("Espresso", 90, 95));
        System.out.println("----------");
    }
}

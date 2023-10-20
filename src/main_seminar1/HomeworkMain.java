package main_seminar1;

import java.util.ArrayList;

public class HomeworkMain {
    public static void main(String[] args) {
        HomeworkHotDrink hd1 = new HomeworkHotDrink("Americano", 65, 250, 95);
        HomeworkHotDrink hd2 = new HomeworkHotDrink("Green tea", 50, 350, 90);
        HomeworkHotDrink hd3 = new HomeworkHotDrink("Hot Chocolate", 190, 400, 95);
        HomeworkHotDrink hd4 = new HomeworkHotDrink("Espresso", 70, 30, 98);
        HomeworkHotDrink hd5 = new HomeworkHotDrink("Cappuccino", 100, 200, 87);

        HomeworkHotDrinkVendingMachine hotDrinkVendingMachine = new HomeworkHotDrinkVendingMachine(new ArrayList<>());
        hotDrinkVendingMachine.addHotDrink(hd1);
        hotDrinkVendingMachine.addHotDrink(hd2);
        hotDrinkVendingMachine.addHotDrink(hd3);
        hotDrinkVendingMachine.addHotDrink(hd4);
        hotDrinkVendingMachine.addHotDrink(hd5);

        for (HomeworkHotDrink hotDrink:
                hotDrinkVendingMachine.getHotDrinkList()) {
            System.out.println(hotDrink);
        }

        System.out.println("----------");
        System.out.println(hotDrinkVendingMachine.getProduct("Americano"));
        System.out.println(hotDrinkVendingMachine.getProduct("Latte"));
        System.out.println(hotDrinkVendingMachine.getProduct("Espresso", 30, 98));
        System.out.println(hotDrinkVendingMachine.getProduct("Espresso", 90, 95));
    }
}

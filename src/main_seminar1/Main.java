package main_seminar1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BottleOfWater b1 = new BottleOfWater("1", 1, 1);
        BottleOfWater b2 = new BottleOfWater("2", 2, 2);
        BottleOfWater b3 = new BottleOfWater("5", 4, 3);
        BottleOfWater b4 = new BottleOfWater("15", 123, 1);
        BottleOfWater b5 = new BottleOfWater("20", 6, 5);

        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine(new ArrayList<>());
        vendingMachine.addBottleOfWater(b1);
        vendingMachine.addBottleOfWater(b2);
        vendingMachine.addBottleOfWater(b3);
        vendingMachine.addBottleOfWater(b4);
        vendingMachine.addBottleOfWater(b5);
        System.out.println(vendingMachine.getProduct("20", 5));
        System.out.println(vendingMachine.getProduct("20", 100));

//        for (BottleOfWatter b : vendingMachine.getBottleOfWaters()) {
//            System.out.println(b);
//        }
    }
}

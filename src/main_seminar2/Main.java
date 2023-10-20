package main_seminar2;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Test1");
        Human human2 = new Human("Test2");
        Human human3 = new Human("Test3");

        market.acceptToMarket(human1);
        market.update();
        market.acceptToMarket(human2);
        market.update();
        market.acceptToMarket(human3);
        market.update();

        while (!market.queueEmpty()){
            market.update();
        }
    }
}

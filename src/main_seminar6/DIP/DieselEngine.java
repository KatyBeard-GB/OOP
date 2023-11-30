package main_seminar6.DIP;

public class DieselEngine implements IEngine{

    @Override
    public void start() {
        System.out.println("Запустили дизельный двигатель!");
    }
}

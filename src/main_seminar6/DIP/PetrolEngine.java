package main_seminar6.DIP;

public class PetrolEngine implements IEngine{

    @Override
    public void start() {
        System.out.println("Запустили бензиновый двигатель!");
    }
}

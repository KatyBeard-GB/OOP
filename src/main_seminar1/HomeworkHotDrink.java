package main_seminar1;

public class HomeworkHotDrink extends BottleOfWater{
    private int temperature;

    public HomeworkHotDrink(String name, double cost, double volume, int temperature) {
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name = " + super.getName() +
                " volume = " + super.getVolume() +
                " temperature = " + temperature +
                " cost = " + super.getCost() +
                '}';
    }
}

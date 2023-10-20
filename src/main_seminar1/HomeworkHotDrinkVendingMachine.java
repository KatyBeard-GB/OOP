package main_seminar1;

import java.util.List;

public class HomeworkHotDrinkVendingMachine implements VendingMachine{
    List<HomeworkHotDrink> hotDrinkList;

    public HomeworkHotDrinkVendingMachine(List<HomeworkHotDrink> hotDrinkList) {
        this.hotDrinkList = hotDrinkList;
    }

    public List<HomeworkHotDrink> getHotDrinkList() {
        return hotDrinkList;
    }

    public void setHotDrinkList(List<HomeworkHotDrink> hotDrinkList) {
        this.hotDrinkList = hotDrinkList;
    }

    @Override
    public Product getProduct(String name) {
        for (HomeworkHotDrink hotDrink:
                hotDrinkList) {
            if(hotDrink.getName().equals(name)) return hotDrink;
        }
        return null;
    }

    public Product getProduct(String name, double volume, int temperature){
        for (HomeworkHotDrink hotDrink:
                hotDrinkList) {
            if(hotDrink.getName().equals(name)
                    && hotDrink.getVolume() == volume
                    && hotDrink.getTemperature() == temperature)
                return hotDrink;
        }
        return null;
    }

    public void addHotDrink(HomeworkHotDrink hotDrink){
        this.hotDrinkList.add(hotDrink);
    }
}

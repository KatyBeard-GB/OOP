package main_seminar1;

import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine{
    List<BottleOfWater> bottleOfWaters;

    public BottleOfWaterVendingMachine(List<BottleOfWater> products) {
        this.bottleOfWaters = products;
    }

    public List<BottleOfWater> getBottleOfWaters() {
        return bottleOfWaters;
    }

    public void setBottleOfWaters(List<BottleOfWater> bottleOfWaters) {
        this.bottleOfWaters = bottleOfWaters;
    }

    @Override
    public Product getProduct(String name) {
        for (BottleOfWater bottle:
                bottleOfWaters) {
            if(bottle.getName().equals(name)) return bottle;
        }
        return null;
    }

    public Product getProduct(String name, double volume) {
        for (BottleOfWater bottle:
                bottleOfWaters) {
            if(bottle.getName().equals(name) && bottle.getVolume() == volume)
                return bottle;
        }
        return null;
    }

    public void addBottleOfWater(BottleOfWater bottleOfWater){
        this.bottleOfWaters.add(bottleOfWater);
    }
}

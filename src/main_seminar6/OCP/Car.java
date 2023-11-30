package main_seminar6.OCP;

public class Car extends Vehicle{
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    @Override
    public double calculateMaxSpeed(){
        return super.getMaxSpeed() * 0.8;
    }
}

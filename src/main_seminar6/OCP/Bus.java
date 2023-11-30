package main_seminar6.OCP;

public class Bus extends Vehicle{
    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }

    @Override
    public double calculateMaxSpeed(){
        return super.getMaxSpeed() * 0.5;
    }
}

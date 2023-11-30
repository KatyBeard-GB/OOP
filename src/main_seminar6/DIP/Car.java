package main_seminar6.DIP;

public class Car {
    private IEngine engine;

    public Car(IEngine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }
}

package main_seminar6.ISP;

public class Circle implements IShape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double perimetr() {
        return 2 * 3.14 * radius;
    }
}

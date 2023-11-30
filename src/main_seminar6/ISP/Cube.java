package main_seminar6.ISP;

public class Cube implements IShape3D{
    private int len;

    public Cube(int len) {
        this.len = len;
    }

    @Override
    public double perimetr() {
        return len * 12;
    }

    @Override
    public double volume() {
        return len * len * len;
    }
}

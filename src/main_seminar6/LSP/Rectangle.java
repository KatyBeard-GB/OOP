package main_seminar6.LSP;

public class Rectangle extends Quadrangle{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return height * width;
    }
}

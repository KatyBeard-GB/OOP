package main_seminar6.LSP;

public class Square extends Quadrangle{
    private int len;

    public Square(int len) {
        this.len = len;
    }

    @Override
    public double area() {
        return len * len;
    }
}

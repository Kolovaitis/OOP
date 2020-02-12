package sample;

public class Oval extends Shape {
    private double width, height;

    public Oval(Coordinate coordinate, double width, double height) {
        this.width = width;
        this.height = height;
        this.coordinate = coordinate;
    }

    @Override
    double getSquare() {
        return Math.PI * width * height / 4;
    }

    @Override
    public void draw(Viewable painter) {
        painter.drawOval(coordinate, width, height);
    }
}

package sample.Shapes;

import sample.Coordinate;
import sample.Viewable.Viewable;

public class Oval extends Shape {
    private double width, height;

    public Oval(Coordinate coordinate, double width, double height) {
        this.width = width;
        this.height = height;
        this.coordinate = coordinate;
    }

    @Override
    public double getSquare() {
        return Math.PI * width * height / 4;
    }

    @Override
    public void renewSize(Coordinate coordinate) {
        this.width = coordinate.x - this.coordinate.x;
        this.height = coordinate.y - this.coordinate.y;
    }

    @Override
    public void draw(Viewable painter) {
        painter.drawOval(coordinate, width, height);
    }
}

package sample.Shapes;

import sample.Coordinate;
import sample.Viewable.Viewable;

public class Circle extends Shape {
    private double radius;

    public Circle(Coordinate coordinate, double radius) {
        this.radius = radius;
        this.coordinate = coordinate;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void renewSize(Coordinate coordinate) {
        this.radius = Math.sqrt(Math.pow(this.coordinate.x-coordinate.x, 2)+ Math.pow(this.coordinate.y-coordinate.y,2));
    }

    @Override
    public void draw(Viewable painter) {
        painter.drawCircle(coordinate, radius);
    }
}

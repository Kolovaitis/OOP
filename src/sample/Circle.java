package sample;

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
    double getSquare() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public void draw(Viewable painter) {
        painter.drawCircle(coordinate, radius);
    }
}

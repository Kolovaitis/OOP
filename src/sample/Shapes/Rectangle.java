package sample.Shapes;

import sample.Coordinate;

import java.util.ArrayList;
import java.util.List;

public class Rectangle extends PoligonShape {
    double width, height;

    public Rectangle(Coordinate coordinate, double width, double height) {
        this.width = width;
        this.height = height;
        this.coordinate = coordinate;
    }

    @Override
    public double getSquare() {
        return width * height;
    }

    @Override
    public void renewSize(Coordinate coordinate) {
        this.width = coordinate.x - this.coordinate.x;
        this.height = coordinate.y - this.coordinate.y;
    }


    @Override
    List<Coordinate> getCoordinates() {
        ArrayList<Coordinate> coordinates = new ArrayList<>();
        coordinates.add(new Coordinate(coordinate.x, coordinate.y));
        coordinates.add(new Coordinate(coordinate.x, coordinate.y+height));
        coordinates.add(new Coordinate(coordinate.x+width, coordinate.y+height));
        coordinates.add(new Coordinate(coordinate.x+width, coordinate.y));
        return coordinates;
    }
}

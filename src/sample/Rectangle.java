package sample;

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
    double getSquare() {
        return width * height;
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

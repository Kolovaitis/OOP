package sample;

import java.util.ArrayList;
import java.util.List;

public class Triangle extends PoligonShape {
    private double side;

    public Triangle(Coordinate coordinate, double side) {
        this.coordinate = coordinate;
        this.side = side;
    }

    @Override
    double getSquare() {
        return Math.pow(side, 2)*Math.sqrt(3)/4;
    }



    private double getHeight() {
        return side*Math.sqrt(3)/2;
    }

    @Override
    List<Coordinate> getCoordinates() {
        double height = getHeight();
        ArrayList<Coordinate> coordinates = new ArrayList<>();
        coordinates.add(new Coordinate(coordinate.x+side/2, coordinate.y));
        coordinates.add(new Coordinate(coordinate.x+side, coordinate.y+height));
        coordinates.add(new Coordinate(coordinate.x, coordinate.y+height));
        return coordinates;
    }
}

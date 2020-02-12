package sample;

import java.util.ArrayList;
import java.util.List;

public class Square extends PoligonShape {
    private double side;

    public Square(Coordinate coordinate, double side) {
        this.side = side;
        this.coordinate = coordinate;
    }

    @Override
    double getSquare() {
        return Math.pow(side, 2);
    }


    @Override
    List<Coordinate> getCoordinates() {
        ArrayList<Coordinate> coordinates = new ArrayList<>();
        coordinates.add(new Coordinate(coordinate.x, coordinate.y));
        coordinates.add(new Coordinate(coordinate.x, coordinate.y+side));
        coordinates.add(new Coordinate(coordinate.x+side, coordinate.y+side));
        coordinates.add(new Coordinate(coordinate.x+side, coordinate.y));
        return coordinates;
    }
}

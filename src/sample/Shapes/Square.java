package sample.Shapes;

import sample.Coordinate;

import java.util.ArrayList;
import java.util.List;

public class Square extends PoligonShape {
    private double halfSide;

    public Square(Coordinate coordinate, double halfSide) {
        this.halfSide = halfSide;
        this.coordinate = coordinate;
    }

    @Override
    public double getSquare() {
        return Math.pow(halfSide*2, 2);
    }

    @Override
    public void renewSize(Coordinate coordinate) {
        double deltaX = Math.abs(this.coordinate.x-coordinate.x);
        double deltaY = Math.abs(this.coordinate.y - coordinate.y);
        halfSide = deltaX>deltaY?deltaX:deltaY;
    }


    @Override
    List<Coordinate> getCoordinates() {
        ArrayList<Coordinate> coordinates = new ArrayList<>();
        coordinates.add(new Coordinate(coordinate.x-halfSide, coordinate.y-halfSide));
        coordinates.add(new Coordinate(coordinate.x-halfSide, coordinate.y+halfSide));
        coordinates.add(new Coordinate(coordinate.x+halfSide, coordinate.y+halfSide));
        coordinates.add(new Coordinate(coordinate.x+halfSide, coordinate.y-halfSide));
        return coordinates;
    }
}

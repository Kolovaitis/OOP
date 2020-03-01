package sample.Shapes;

import sample.Coordinate;

import java.util.ArrayList;
import java.util.List;

public class Triangle extends PoligonShape {
    private double width;
    private double height;

    public Triangle(Coordinate coordinate, double width, double height) {
        this.coordinate = coordinate;
        this.height = height;
        this.width = width;
    }

    @Override
    public double getSquare() {
        return width*height/2;
    }

    @Override
    public void renewSize(Coordinate coordinate) {
        this.width = coordinate.x - this.coordinate.x;
        this.height = coordinate.y - this.coordinate.y;
    }



    @Override
    List<Coordinate> getCoordinates() {
        ArrayList<Coordinate> coordinates = new ArrayList<>();
        coordinates.add(new Coordinate(coordinate.x+width/2, coordinate.y));
        coordinates.add(new Coordinate(coordinate.x+width, coordinate.y+height));
        coordinates.add(new Coordinate(coordinate.x, coordinate.y+height));
        return coordinates;
    }
}

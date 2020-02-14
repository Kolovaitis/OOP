package sample.Shapes;

import sample.Coordinate;
import sample.Viewable.Viewable;

public class Section extends Shape {

    private Coordinate endCoordinate;

    public Section(Coordinate coordinate,Coordinate endCoordinate) {
        this.endCoordinate = endCoordinate;
        this.coordinate = coordinate;
    }

    @Override
    public double getSquare() {
        return 0;
    }

    @Override
    public void renewSize(Coordinate coordinate) {
        endCoordinate = coordinate;
    }

    @Override
    public void draw(Viewable painter) {
        painter.drawLine(coordinate, endCoordinate);
    }
}

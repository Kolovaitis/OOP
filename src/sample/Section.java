package sample;

public class Section extends Shape {

    private Coordinate endCoordinate;

    public Section(Coordinate coordinate,Coordinate endCoordinate) {
        this.endCoordinate = endCoordinate;
        this.coordinate = coordinate;
    }

    @Override
    double getSquare() {
        return 0;
    }

    @Override
    public void draw(Viewable painter) {
        painter.drawLine(coordinate, endCoordinate);
    }
}

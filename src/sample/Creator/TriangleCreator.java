package sample.Creator;

import sample.Coordinate;
import sample.Shapes.Shape;
import sample.Shapes.Triangle;

public class TriangleCreator implements Creator {
    @Override
    public Shape create(Coordinate coordinate) {
        return new Triangle(coordinate, 0, 0);
    }
}

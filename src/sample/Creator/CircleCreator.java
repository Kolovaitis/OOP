package sample.Creator;

import sample.Coordinate;
import sample.Shapes.Circle;
import sample.Shapes.Shape;

public class CircleCreator implements Creator {
    @Override
    public Shape create(Coordinate coordinate) {
        return new Circle(coordinate, 0);
    }
}

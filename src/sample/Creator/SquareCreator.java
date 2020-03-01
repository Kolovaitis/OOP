package sample.Creator;

import sample.Coordinate;
import sample.Shapes.Shape;
import sample.Shapes.Square;

public class SquareCreator implements Creator {
    @Override
    public Shape create(Coordinate coordinate) {
        return new Square(coordinate, 0);
    }
}

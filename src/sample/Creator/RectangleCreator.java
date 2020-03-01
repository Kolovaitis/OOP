package sample.Creator;

import sample.Coordinate;
import sample.Shapes.Rectangle;
import sample.Shapes.Shape;

public class RectangleCreator implements Creator {
    @Override
    public Shape create(Coordinate coordinate) {
        return new Rectangle(coordinate, 0, 0);
    }
}

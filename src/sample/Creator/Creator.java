package sample.Creator;

import sample.Coordinate;
import sample.Shapes.Shape;

public interface Creator {
    public Shape create(Coordinate coordinate);
}

package sample.Creator;

import sample.Coordinate;
import sample.Shapes.Oval;
import sample.Shapes.Shape;

public class OvalCreator implements Creator {
    @Override
    public Shape create(Coordinate coordinate) {
        return new Oval(coordinate, 0, 0);
    }
}

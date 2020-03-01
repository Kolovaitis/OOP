package sample.Creator;

import sample.Coordinate;
import sample.Shapes.Section;
import sample.Shapes.Shape;

public class SectionCreator implements Creator {
    @Override
    public Shape create(Coordinate coordinate) {
        return new Section(coordinate, coordinate);
    }
}

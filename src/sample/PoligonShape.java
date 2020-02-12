package sample;

import java.util.List;

public abstract class PoligonShape extends Shape{
    @Override
    public void draw(Viewable painter) {
        painter.drawPoligon(getCoordinates());
    }
    abstract List<Coordinate> getCoordinates();
}

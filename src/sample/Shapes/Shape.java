package sample.Shapes;

import sample.Coordinate;

public abstract class Shape implements Drawable {
    Coordinate coordinate;
    public abstract double getSquare();
    public abstract void renewSize(Coordinate coordinate);
}

package sample;

import java.util.ArrayList;
import java.util.List;

public interface Viewable {
    void drawLine(Coordinate a, Coordinate b);
    void drawPoligon(List<Coordinate> points);
    void drawCircle(Coordinate center, double radius);
    void drawOval(Coordinate start, double width, double height);
}

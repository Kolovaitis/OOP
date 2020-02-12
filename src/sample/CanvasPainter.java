package sample;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class CanvasPainter implements Viewable {
    private GraphicsContext gc;

    public CanvasPainter(GraphicsContext gc){
        this.gc = gc;
    }

    public void setStrokeColor(Color strokeColor) {
        gc.setStroke(strokeColor);
    }

    public void setFillColor(Color fillColor) {
        gc.setFill(fillColor);
    }
    public void setLineWidth(double width) {
        gc.setLineWidth(width);
    }

    public void setGc(GraphicsContext gc) {
        this.gc = gc;
    }

    @Override
    public void drawLine(Coordinate a, Coordinate b) {
        gc.strokeLine(a.x, a.y, b.x, b.y);
    }

    @Override
    public void drawPoligon(List<Coordinate> points) {
        //Осторожно говнокод!
        double[]x = new double[points.size()];
        double[]y = new double[points.size()];
        for(int i = 0; i< points.size();i++){
            x[i] = points.get(i).x;
            y[i] = points.get(i).y;
        }
        gc.fillPolygon(x, y, points.size());
        gc.strokePolygon(x, y, points.size());
    }

    @Override
    public void drawCircle(Coordinate center, double radius) {
        gc.fillOval(center.x-radius, center.y-radius,radius*2, radius*2);
        gc.strokeOval(center.x-radius, center.y-radius,radius*2, radius*2);
    }

    @Override
    public void drawOval(Coordinate start, double width, double height) {
        gc.fillOval(start.x, start.y, width, height);
        gc.strokeOval(start.x, start.y, width, height);
    }
}

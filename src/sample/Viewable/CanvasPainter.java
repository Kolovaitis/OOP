package sample.Viewable;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import sample.Coordinate;

import java.util.List;

public class CanvasPainter implements Viewable {
    private GraphicsContext gc;
    private Canvas canvas;
    public CanvasPainter(Canvas canvas,Color strokeColor, Color fillColor, double lineWidth){
        this.gc = canvas.getGraphicsContext2D();
        this.setStrokeColor(strokeColor);
        this.setLineWidth(lineWidth);
        this.setFillColor(fillColor);
        this.canvas = canvas;
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
        Coordinate correct = correctCoordinate(start, width, height);
        width = Math.abs(width);
        height = Math.abs(height);
        gc.fillOval(correct.x, correct.y, width, height);
        gc.strokeOval(correct.x, correct.y, width, height);
    }

    private Coordinate correctCoordinate(Coordinate start, double width, double height) {
        return new Coordinate(width<0?start.x+width:start.x, height<0?start.y+height:start.y);
    }

    @Override
    public void drawText(Coordinate start, String text) {
        gc.strokeText(text, start.x, start.y);
    }

    @Override
    public void clear() {
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
    }

}

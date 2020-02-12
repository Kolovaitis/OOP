package sample;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private Viewable painter;

    public Model(Viewable painter){
        this.painter = painter;

    }
    public List<Shape> getSampleShapes(){
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(new Coordinate(50, 50), 40));
        shapes.add(new Rectangle(new Coordinate(100, 10), 140, 80));
        shapes.add(new Triangle(new Coordinate(250, 10), 90));
        shapes.add(new Square(new Coordinate(350, 10), 80));
        shapes.add(new Section(new Coordinate(440, 10),new Coordinate(540, 90)));
        shapes.add(new Oval(new Coordinate(550, 10), 140, 80));
        return shapes;
    }
    public void drawSample(){
        for(Shape shape: getSampleShapes()){
            shape.draw(painter);
        }
    }

}

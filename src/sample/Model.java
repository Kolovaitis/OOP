package sample;

import sample.Creator.*;
import sample.Shapes.*;
import sample.Viewable.Viewable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Model {
    private HashMap<ShapeType, Creator> creators;
    private Creator currentCreator;
    private Shape newShape;
    private Viewable painter;
    private Viewable preview;

    public Model(Viewable painter, Viewable preview) {
        this.painter = painter;
        this.preview = preview;
        initCreators();
        this.currentCreator = creators.get(ShapeType.CIRCLE);
        this.newShape = null;
    }

    private void initCreators() {
        creators = new HashMap<>();
        creators.put(ShapeType.CIRCLE, new CircleCreator());
        creators.put(ShapeType.OVAL, new OvalCreator());
        creators.put(ShapeType.RECTANGLE, new RectangleCreator());
        creators.put(ShapeType.SECTION, new SectionCreator());
        creators.put(ShapeType.SQUARE, new SquareCreator());
        creators.put(ShapeType.TRIANGLE, new TriangleCreator());
    }

    public List<Shape> getSampleShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(new Coordinate(50, 50), 40));
        shapes.add(new Rectangle(new Coordinate(100, 10), 140, 80));
        shapes.add(new Triangle(new Coordinate(250, 10), 90, 80));
        shapes.add(new Square(new Coordinate(390, 50), 40));
        shapes.add(new Section(new Coordinate(440, 10), new Coordinate(540, 90)));
        shapes.add(new Oval(new Coordinate(550, 10), 140, 80));
        return shapes;
    }

    public void drawSample() {
        for (Shape shape : getSampleShapes()) {
            shape.draw(painter);
        }
    }

    public void changeCreator(ShapeType type) {
        currentCreator = creators.get(type);
    }

    public void createNewShape(Coordinate coordinate) {
        newShape = currentCreator.create(coordinate);
    }

    public void renewNewShapeSize(Coordinate coordinate) {
        newShape.renewSize(coordinate);
    }

    public void rerenderNewShape() {
        preview.clear();
        newShape.draw(preview);
    }

    public void saveShape() {
        preview.clear();
        newShape.draw(painter);
    }

}

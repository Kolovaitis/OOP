package sample;


import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import sample.Creator.ShapeType;

import java.util.HashMap;

public class Controller {
    private HashMap<KeyCode, ShapeType> codes;
    private Model model;
    private Scene scene;

    public void setModel(Model model) {
        this.model = model;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
        setUpMouseEvents();
        setUpCodes();
        setUpKeyListener();
    }

    private void setUpMouseEvents() {
        setUpMousePressed();
        setUpMouseDragged();
        setUpMouseReleased();
    }

    private void setUpMouseReleased() {
        scene.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                model.renewNewShapeSize(new Coordinate(event.getX(), event.getY()));
                model.saveShape();
            }
        });
    }

    private void setUpMouseDragged() {
        scene.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                model.renewNewShapeSize(new Coordinate(event.getX(), event.getY()));
                model.rerenderNewShape();
            }
        });
    }

    private void setUpMousePressed() {
        scene.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                model.createNewShape(new Coordinate(event.getX(), event.getY()));
            }
        });
    }

    private void setUpKeyListener() {
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                KeyCode code = keyEvent.getCode();
                if (codes.containsKey(code)) {
                    model.changeCreator(codes.get(code));
                }
            }
        });
    }

    private void setUpCodes() {
        codes = new HashMap<>();
        codes.put(KeyCode.DIGIT1, ShapeType.CIRCLE);
        codes.put(KeyCode.DIGIT2, ShapeType.RECTANGLE);
        codes.put(KeyCode.DIGIT3, ShapeType.TRIANGLE);
        codes.put(KeyCode.DIGIT4, ShapeType.SQUARE);
        codes.put(KeyCode.DIGIT5, ShapeType.SECTION);
        codes.put(KeyCode.DIGIT6, ShapeType.OVAL);
    }
}

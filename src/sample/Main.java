package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    private Model model;
    private Canvas canvas;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Lab_1");
        Scene scene = new Scene(root, 800, 640);
        primaryStage.setScene(scene);
        primaryStage.show();
        canvas = (Canvas) scene.lookup("#canvas");
        initModel();
    }

    private CanvasPainter getPainter(Canvas canvas) {
        CanvasPainter painter = new CanvasPainter(canvas.getGraphicsContext2D());
        painter.setFillColor(Color.BURLYWOOD);
        painter.setLineWidth(5);
        painter.setStrokeColor(Color.CORNFLOWERBLUE);
        return painter;
    }

    private void initModel() {
        model = new Model(getPainter(canvas));
        model.drawSample();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

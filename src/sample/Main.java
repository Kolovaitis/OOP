package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import sample.Viewable.CanvasPainter;

public class Main extends Application {
    private Model model;
    private Canvas previewCanvas;
    private Canvas mainCanvas;

    @Override
    public void start(Stage primaryStage) throws Exception {

        String path = "sample.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent root = fxmlLoader.load(getClass().getResource(path).openStream());
        primaryStage.setTitle("Lab_1");
        Scene scene = new Scene(root, 800, 640);
        primaryStage.setScene(scene);
        primaryStage.show();
        mainCanvas = (Canvas) scene.lookup("#canvas");
        previewCanvas = (Canvas) scene.lookup("#preview");
        initModel();
        Controller controller = fxmlLoader.getController();
        controller.setModel(model);
        controller.setScene(scene);
    }




    private void initModel() {
        CanvasPainter mainPainter = new CanvasPainter(mainCanvas, Color.BURLYWOOD,Color.CORNFLOWERBLUE, 5);
        CanvasPainter previewPainter = new CanvasPainter(previewCanvas, Color.BURLYWOOD,Color.CORNFLOWERBLUE, 1);
        model = new Model(mainPainter,previewPainter);
        model.drawSample();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

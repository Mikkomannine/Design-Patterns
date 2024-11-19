package Flyweight;



import Flyweight.maps.CityMap;
import Flyweight.maps.Map;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Game extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("RPG Map");

        Pane root = new Pane();
        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Map cityMap = new CityMap(20, 15);
        cityMap.render(gc);


        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

package Solo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.Group;


public class Dvd extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage)
    {
        int height = 500;
        int width = 800;
        int rHeight = (int) (Math.random()*height + 1);
        int rWidth = (int) (Math.random()*width + 1);
        Rectangle r = new Rectangle();
        r.setX(rWidth);
        r.setY(rHeight);
        r.setWidth(50);
        r.setHeight(50);

        Group root = new Group(r);
        Scene scene = new Scene(root, width, height);
        stage.setScene(scene);
        stage.show();

    }

    public static class runThing
    {
        while(true)
        {

        }
    }

}

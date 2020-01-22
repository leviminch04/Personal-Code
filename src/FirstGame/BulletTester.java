package FirstGame;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.util.Duration;

import java.awt.*;

public class BulletTester extends Application
{
    public void start(Stage stage)
    {
        Group root = new Group();

//        double mouseX = MouseInfo.getPointerInfo().getLocation().getX();
//        double mouseY = MouseInfo.getPointerInfo().getLocation().getY();

        Timeline run = new Timeline();
        run.setCycleCount(Timeline.INDEFINITE);
        run.getKeyFrames().add(
                new KeyFrame(Duration.seconds((double) 1 / 60), event ->
                {
                    Bullet bullet = new Bullet(MouseInfo.getPointerInfo().getLocation().getX(), MouseInfo.getPointerInfo().getLocation().getY());
                    root.getChildren().add(bullet);
                })
        );run.playFromStart();

        Scene scene = new Scene(root);

        stage.setFullScreen(true);
        stage.setTitle("Key Detecter");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}

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
import java.sql.Time;
import java.util.ArrayList;

public class BulletTester extends Application
{
    public void start(Stage stage)
    {
        Group root = new Group();
        ArrayList<Bullet> bulletList = new ArrayList<>();

//        double mouseX = MouseInfo.getPointerInfo().getLocation().getX();
//        double mouseY = MouseInfo.getPointerInfo().getLocation().getY();

        Timeline run = new Timeline();
        run.setCycleCount(Timeline.INDEFINITE);
        run.getKeyFrames().add(
                new KeyFrame(Duration.seconds((double) 1 / 144), event ->
                {
                    for (int i = 0; i < root.getChildren().size(); i++) {

                        bulletList.get(i).goodMove();
                    }
                })
        );run.playFromStart();

        Timeline thing = new Timeline();
        thing.setCycleCount(Timeline.INDEFINITE);
        thing.getKeyFrames().add(
                new KeyFrame(Duration.seconds((double) 1 / 5), event ->
                {
                    Bullet bullet = new Bullet(1,1, MouseInfo.getPointerInfo().getLocation().getX(), MouseInfo.getPointerInfo().getLocation().getY());
                    root.getChildren().add(bullet);
                    bulletList.add(bullet);
                })
        );thing.playFromStart();

        Scene scene = new Scene(root);

        stage.setFullScreen(true);
        stage.setTitle("Bullet Tester");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}

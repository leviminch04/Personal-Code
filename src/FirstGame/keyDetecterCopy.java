package FirstGame;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.awt.*;
import java.util.ArrayList;

public class keyDetecterCopy extends Application
{
    public void start(Stage stage)
    {
        final int[] circleX = {150};
        final int[] circleY = {150};
        final int[] move = {10};
        int width = 300;
        int height = 300;
        int circleRadius = 20;
        final int ENEMYMOVE = 1;
        Button button = new Button("");
        //button.setVisible(false);
        button.setShape(new Circle(0));
        button.setMaxSize(2,2);
        Move circle = new Move();
        circle.setCenterX(circleX[0]);
        circle.setCenterY(circleY[0]);
        circle.setRadius(circleRadius);
        circle.setStroke(Color.BLUE);
        Move enemy = new Move();
        enemy.setCenterX((double) (Math.random() * width));
        enemy.setCenterY((double) (Math.random() * height));
        enemy.setRadius(circleRadius);
        enemy.setFill(Color.BLACK);
        enemy.setStroke(Color.RED);
        Group root = new Group(button, circle, enemy);
        ArrayList<Bullet> bulletList = new ArrayList<Bullet>();

        button.setOnKeyPressed(new EventHandler<KeyEvent>() {

            @Override
            public void handle(KeyEvent event) {
                if(event.getCode() == KeyCode.SPACE)
                {
                    Bullet bullet = new Bullet(circle.getCenterX(), circle.getCenterY(), MouseInfo.getPointerInfo().getLocation().getX(), MouseInfo.getPointerInfo().getLocation().getY());
                    bulletList.add(bullet);
                    root.getChildren().add(bullet);
                }
            }
        });
        Timeline enemyMovement = new Timeline();
        enemyMovement.setCycleCount(Timeline.INDEFINITE);
        enemyMovement.getKeyFrames().add(
                new KeyFrame(Duration.seconds((double) 1 / 60), event -> {
                    circle.move(circle.getCenterX(), circle.getCenterY(), MouseInfo.getPointerInfo().getLocation().getX(), MouseInfo.getPointerInfo().getLocation().getY(), 1);
                    enemy.move(enemy.getCenterX(), enemy.getCenterY(), circle.getCenterX(), circle.getCenterY(), .5);
                    for (int i = 0; i < bulletList.size(); i++) {
                        bulletList.get(i).goodMove();
                        System.out.println("run bullet move loop");
                    }

                })

        );

        enemyMovement.playFromStart();



        Scene scene = new Scene(root, width, height);
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

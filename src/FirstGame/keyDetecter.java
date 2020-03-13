package FirstGame;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.util.Duration;

public class keyDetecter extends Application
{
    public void start(Stage stage)
    {
        final int[] circleX = {150};
        final int[] circleY = {150};
        final int[] move = {10};
        int width = 300;
        int height = 300;
        int circleRadius = 20;
        final double ENEMYMOVE = 1;
        Button button = new Button("");
        //button.setVisible(false);
        button.setShape(new Circle(0));
        button.setMaxSize(2,2);
        Circle circle = new Circle();
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


        button.setOnKeyPressed(new EventHandler<KeyEvent>() {

            @Override
            public void handle(KeyEvent event) {
                if(event.getCode() == KeyCode.A)
                {
                    circleX[0] -= move[0];
                    circle.setCenterX(circleX[0]);
                }

                if(event.getCode() == KeyCode.D)
                {
                    circleX[0] += move[0];
                    circle.setCenterX(circleX[0]);
                }

                if(event.getCode() == KeyCode.S)
                {
                    circleY[0] += move[0];
                    circle.setCenterY(circleY[0]);
                }

                if(event.getCode() == KeyCode.W)
                {
                    circleY[0] -= move[0];
                    circle.setCenterY(circleY[0]);
                }
            }
        });
        Timeline enemyMovement = new Timeline();
        enemyMovement.setCycleCount(Timeline.INDEFINITE);
        enemyMovement.getKeyFrames().add(
                new KeyFrame(Duration.seconds((double) 1 / 60), event -> {
                    enemy.move(enemy.getCenterX(), enemy.getCenterY(), circle.getCenterX(), circle.getCenterY(), .5);
                })

        );

        enemyMovement.playFromStart();



        Scene scene = new Scene(root, width, height);

        stage.setTitle("Key Detecter");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}

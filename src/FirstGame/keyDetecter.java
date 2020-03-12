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
        Circle enemy = new Circle();
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
                    System.out.println("work");
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
                    if(circle.getCenterX() > enemy.getCenterX()){
                        enemy.setCenterX((int) (enemy.getCenterX()) + ENEMYMOVE);
                        //System.out.println("enemy + x");
                    }

                    if(circle.getCenterX() < enemy.getCenterX()){
                        enemy.setCenterX( (int) (enemy.getCenterX()) - ENEMYMOVE);
                        //System.out.println("enemy - x");
                    }

                    if(circle.getCenterY() > enemy.getCenterY()){
                        enemy.setCenterY((int) (enemy.getCenterY()) + ENEMYMOVE);
                        //System.out.println("enemy + y");
                    }

                    if(circle.getCenterY() < enemy.getCenterY()){
                        enemy.setCenterY( (int) (enemy.getCenterY()) - ENEMYMOVE);
                        //System.out.println("enemy - Y");
                    }

                    if(circle.getCenterX() == enemy.getCenterX() && circle.getCenterY() == enemy.getCenterY())
                    {
                        System.out.println("collide");
                        //wtf did i just do?
                        root.getChildren().remove(circle);
                    }
//                    System.exit(-1);


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

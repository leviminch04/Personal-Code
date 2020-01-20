package Solo;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;

public class keyDetecter extends Application
{
    public void start(Stage stage)
    {
        final int[] circleX = {150};
        final int[] circleY = {150};
        final int[] move = {10};
        int width = 300;
        int height = 300;
        int circleRadius = 10;
        Button button = new Button("");
        //button.setVisible(false);
        button.setShape(new Circle(0));
        button.setMaxSize(2,2);
        Circle circle = new Circle();
        circle.setCenterX(circleX[0]);
        circle.setCenterY(circleY[0]);
        circle.setRadius(circleRadius);
        button.setOnKeyPressed(new EventHandler<KeyEvent>() {

            @Override
            public void handle(KeyEvent event) {
                if(event.getCode() == KeyCode.SHIFT)
                {
                    move[0] = 100;
                }

                if(event.getCode() != KeyCode.SHIFT)
                {
                    move[0] = 10;
                }

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

                if(circle.getCenterX() >= width)
                {
                    circle.setCenterX(0);
                    System.out.println(circle.getCenterX());
                }

//                if(circle.getCenterX() <= 0)
//                {
//                    circle.setCenterX(width);
//                }


            }
        });


        Group root = new Group(button, circle);
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

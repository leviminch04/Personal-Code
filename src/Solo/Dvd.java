package Solo;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.util.Duration;


public class Dvd extends Application {

    public static void main(String[] args){
        launch(args);
    }
    Rectangle r = new Rectangle();
    int height = 600;
    int width = 800;
    int rWidth2 = 80;
    int rHeight2 = 60;
    int rHeight = (int) (Math.random()*(height - rHeight2)+ 1);
    int rWidth = (int) (Math.random()*(width - rWidth2) + 1);
    String directionX = "right";
    String directionY = "up";
    int red;
    int green;
    int blue;
    @Override
    public void start(Stage stage)
    {

        r.setX(rWidth);
        r.setY(rHeight);
        r.setWidth(rWidth2);
        r.setHeight(rHeight2);
        red = (int) (Math.random()*256);
        green = (int) (Math.random()*256);
        blue = (int) (Math.random()*256);
        r.setFill(Color.rgb(red, green, blue));
        r.setStroke(Color.rgb(red, green, blue));

        Timeline time = new Timeline();
        time.setCycleCount(Timeline.INDEFINITE);
        time.getKeyFrames().add(
                new KeyFrame(Duration.seconds((double) 1 / 300), event -> {
                        if (r.getX() >= width - rWidth2){
                            directionX = "left";
                            red = (int) (Math.random()*256);
                            green = (int) (Math.random()*256);
                            blue = (int) (Math.random()*256);
                            r.setFill(Color.rgb(red, green, blue));
                            r.setStroke(Color.rgb(red, green, blue));
                        }

                        if (r.getY() >= height - rHeight2){
                            directionY = "down";
                            red = (int) (Math.random()*256);
                            green = (int) (Math.random()*256);
                            blue = (int) (Math.random()*256);
                            r.setFill(Color.rgb(red, green, blue));
                            r.setStroke(Color.rgb(red, green, blue));
                        }

                        if (r.getY() <= 0){
                            directionY = "up";
                            red = (int) (Math.random()*256);
                            green = (int) (Math.random()*256);
                            blue = (int) (Math.random()*256);
                            r.setFill(Color.rgb(red, green, blue));
                            r.setStroke(Color.rgb(red, green, blue));
                        }

                        if (r.getX()  <= 0){
                            directionX = "right";
                            red = (int) (Math.random()*256);
                            green = (int) (Math.random()*256);
                            blue = (int) (Math.random()*256);
                            r.setFill(Color.rgb(red, green, blue));
                            r.setStroke(Color.rgb(red, green, blue));
                        }

                        if (directionX.equals("right")) {
                            r.setX(r.getX() + 1);
                        }

                        if(directionY.equals("up"))
                        {
                            r.setY(r.getY() + 1);
                        }

                        if (directionX.equals("left")) {
                            r.setX(r.getX() - 1);
                        }

                        if (directionY.equals("down")) {
                            r.setY(r.getY() - 1);
                        }
                })
        );

        time.playFromStart();



//        time.stop();

        Group root = new Group(r);
        Scene scene = new Scene(root, width, height);
        stage.setScene(scene);
        stage.show();

    }
}

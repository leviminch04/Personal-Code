package Solo;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.util.Duration;


public class Dvd extends Application {

    public static void main(String[] args){
        launch(args);
    }

    Rectangle r = new Rectangle();
    int height = 500;
    int width = 800;
    int changeX = 10;
    int rWidth2 = 50;
    int rHeight2 = 50;
    Button button = new Button("Start");
    int rHeight = (int) (Math.random()*(height - rHeight2)+ 1);
    int rWidth = (int) (Math.random()*(width - rWidth2) + 1);
    String directionX = "right";
    String directionY = "up";
    @Override
    public void start(Stage stage)
    {

        r.setX(rWidth);
        r.setY(rHeight);
        r.setWidth(rWidth2);
        r.setHeight(rHeight2);

        Timeline time = new Timeline();
        time.setCycleCount(Timeline.INDEFINITE);
        time.getKeyFrames().add(
                new KeyFrame(Duration.seconds(.01), event -> {
                        if (r.getX() >= width ){
                            directionX = "left";
                        }

                        if (r.getY() >= height ){
                            directionY = "down";
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

        Group root = new Group(r, button);
        Scene scene = new Scene(root, width, height);
        stage.setScene(scene);
        stage.show();

    }
    /*
    private void buttonPress(ActionEvent actionEvent) {
        //button.setVisible(false);
        animation();

    }
    private void animation() {
        while(true) {
            if (directionX.equals("right")) {
                r.setX(r.getX() + 1);
            }

            if(directionY.equals("up"))
            {
                r.setY(r.getY() + 1);
            }

            if (r.getX() >= width ){
                directionX = "left";
            }

            if (r.getY() >= height ){
                directionY = "down";
            }

            if (directionX.equals("left")) {
                r.setX(r.getX() - 1);
            }

            if (directionY.equals("down")) {
                r.setY(r.getY() - 1);
            }
        }
    }*/

}

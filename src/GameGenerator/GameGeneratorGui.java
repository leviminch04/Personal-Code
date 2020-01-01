package GameGenerator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import java.awt.*;
import java.io.IOException;
import javafx.scene.control.Button;
import javafx.scene.Group;
import javafx.scene.control.Label;

public class GameGeneratorGui extends Application
{
    GameGenerator3 gen = new GameGenerator3();
    GridPane gridPane = new GridPane();
    Label textWall = new Label("aj,hsgdk");
    Font font = new Font(20);
    String str;

    public GameGeneratorGui() throws IOException { }

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException
    {
        Button button = new Button("New Plot");
        button.setOnKeyPressed(new EventHandler<KeyEvent>() {

            @Override
            public void handle(KeyEvent event) {

                if(event.getCode() == KeyCode.ENTER)
                {
                    try {
                        str = gen.genre();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    try {
                        str += " " + gen.charA();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    textWall.setText(str);
                }
            }
        });
        gridPane.add(textWall,0,0);
        gridPane.add(button, 0,1);
        
        Scene scene = new Scene(gridPane, 500, 100);
        stage.setTitle("Plot Generator");
        stage.setScene(scene);
        stage.show();
    }

    private void buttonPress(ActionEvent actionEvent) throws IOException
    {
        textWall.setText("penis");
        textWall.setText(gen.world());
        textWall.setText(textWall.getText() + "\n" + gen.charA);
    }
}

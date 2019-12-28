package GameGenerator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
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
    Label textWall = new Label("");
    Font font = new Font(20);

    public GameGeneratorGui() throws IOException { }

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException
    {
        Button button = new Button("New Plot");
        button.setOnAction(this::buttonPress);
        gridPane.add(textWall,0,0);
        gridPane.add(button, 0,1);
        
        Scene scene = new Scene(gridPane, 500, 100);
        stage.setTitle("Plot Generator");1
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

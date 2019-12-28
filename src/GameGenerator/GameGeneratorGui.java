package GameGenerator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import java.awt.*;
import java.io.IOException;
import javafx.scene.Group;

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
        Button button = new Button("");

        textWall.setFont(font);
        gridPane.add(button, 0,1);
        
        Scene scene = new Scene(gridPane, 500, 100);
        stage.setTitle("Plot Generator");
        stage.setScene(scene);
        stage.show();
    }
}

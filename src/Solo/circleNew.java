package Solo;

import javafx.scene.shape.Circle;

public class circleNew {
    int x;
    int y;
    public circleNew()
    {
    }

    public Circle newCircle(int x, int y)
    {
        this.x = x;
        this.y = y;
        Circle circle = new Circle();
        circle.setRadius(3);
        circle.setTranslateX(x);
        circle.setTranslateY(y);
        return circle;
    }

}

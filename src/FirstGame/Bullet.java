package FirstGame;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Bullet extends Circle
{
    private int radius = 5;
//    private double locX;
//    private double locY;

    public Bullet(double locX, double locY)
    {
//        this.locX = locX;
//        this.locY = locY;
        this.setCenterX(locX);
        this.setCenterY(locY);
        this.setRadius(radius);
        this.setStroke(Color.BLUE);
    }





}

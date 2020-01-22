package FirstGame;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Bullet extends Circle
{
    private int radius = 5;
    public Bullet(double locX, double locY)
    {
        this.setCenterX(locX);
        this.setCenterY(locY);
        this.setRadius(radius);
        this.setStroke(Color.BLUE);
    }


    public void shoot()
    {

    }



}

package FirstGame;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.awt.*;

public class Bullet extends Circle
{
    private double mouseX;
    private double mouseY;
    private int radius = 25;
    private double move = 2.1;
    private double slope;
    private double xDist;
    private double yDist;
    private double angle;
    private double hyp;
    //    private double locX;
//    private double locY;

    public Bullet(double locX, double locY, double mouseX, double mouseY)
    {
//        this.locX = locX;
//        this.locY = locY;
        this.setCenterX(locX);
        this.setCenterY(locY);
        this.setRadius(radius);
        this.setStroke(Color.BLUE);
        xDist = locX - mouseX;
        yDist = locY - mouseY;
        this.mouseX = mouseX;
        this.mouseY = mouseY;
        hyp = Math.sqrt((xDist * xDist) + (yDist * yDist));
        angle = Math.atan2(yDist, xDist);

    }

    public void goodMove()
    {
        this.setCenterX(this.getCenterX() + (move * Math.cos(angle)));
        this.setCenterY(this.getCenterY() + (move * Math.sin(angle)));
    }
}

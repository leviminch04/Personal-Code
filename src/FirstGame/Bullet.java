package FirstGame;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.awt.*;

public class Bullet extends Circle
{
    private double mouseX;
    private double mouseY;
    private int radius = 5;
    private double move = 5;
    private double slope;
    private double xDist;
    private double yDist;
    private double angle;
    private double hyp;
    private double locX;
    private double locY;

    public Bullet(double locX, double locY, double mouseX, double mouseY)
    {
        this.locX = locX;
        this.locY = locY;
        this.setCenterX(locX);
        this.setCenterY(locY);
        this.setRadius(radius);
        this.setStroke(Color.BLUE);
        xDist = locX - mouseX;
        yDist = locY - mouseY;
        angle = Math.atan2(yDist, xDist);
    }

    public double getLocX() {
        return locX;
    }

    public double getLocY() {
        return locY;
    }

    public void goodMove()
    {
        this.setCenterX(this.getCenterX() + ( -1 * move * Math.cos(angle)));
        this.setCenterY(this.getCenterY() + (-1 * move * Math.sin(angle)));
    }
}

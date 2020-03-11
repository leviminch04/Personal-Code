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
    private double moveX;
    private double moveY;
    public Bullet(double locX, double locY, double mouseX, double mouseY)
    {
        this.setCenterX(locX);
        this.setCenterY(locY);
        this.setRadius(radius);
        this.setStroke(Color.BLUE);
        xDist = locX - mouseX;
        yDist = locY - mouseY;
        this.mouseX = mouseX;
        this.mouseY = mouseY;
        slope = ((mouseY) / (mouseX));
        hyp = Math.sqrt((xDist * xDist) + (yDist * yDist));
        angle = yDist / hyp;
        moveX = (Math.cos(angle) * move);
        moveY = (Math.sin(angle) * move);
    }



    public void goodMove()
    {
        if(mouseX > this.getCenterX())
        {
            this.setCenterX(this.getCenterX() + moveX);
        }
        if(mouseX< this.getCenterX())
        {
            this.setCenterX(this.getCenterX() - moveX);
        }

        if(mouseY > this.getCenterY())
        {
            this.setCenterY(this.getCenterY() + moveY);
        }

        if(mouseY < this.getCenterY())
        {
            this.setCenterY(this.getCenterY() - moveY);
        }
    }

    public void move()
    {
        if(mouseX > this.getCenterX())
        {
            this.setCenterX(this.getCenterX() + move);
        }
        if(mouseX< this.getCenterX())
        {
            this.setCenterX(this.getCenterX() - move);
        }

        if(mouseY > this.getCenterY())
        {
            this.setCenterY(this.getCenterY() + move);
        }

        if(mouseY < this.getCenterY())
        {
            this.setCenterY(this.getCenterY() - move);
        }
    }



}

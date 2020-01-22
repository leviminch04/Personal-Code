package FirstGame;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Bullet
{
    private double locX;
    private double locY;
    private double endX;
    private double endY;
    private int radius = 5;
    private Circle circle;
    public Bullet(double locX, double locY)
    {
        this.locX = locX;
        this.locY = locY;
        this.endX = endX;
        this.endY = endY;
        circle = new Circle();
        circle.setCenterX(this.locX);
        circle.setCenterY(this.locY);
        circle.setRadius(radius);
        circle.setStroke(Color.BLUE);
    }

    public Bullet(double locX, double locY, int radius)
    {
        this.locX = locX;
        this.locY = locY;
        this.endX = endX;
        this.endY = endY;
        this.radius = radius;
        circle = new Circle();
        circle.setCenterX(this.locX);
        circle.setCenterY(this.locY);
        circle.setRadius(this.radius);
        circle.setStroke(Color.BLUE);
    }

    public Circle shoot()
    {
        return circle;
    }

    public Circle end(double endX, double endY)
    {
        this.endX = endX;
        this.endY = endY;
        circle.setCenterX(this.endX);
        circle.setCenterY(this.endY);
        return circle;
    }


}

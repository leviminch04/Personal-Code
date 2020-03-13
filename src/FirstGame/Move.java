package FirstGame;

import javafx.scene.shape.Circle;

public class Move extends Circle {
    private double startX, startY, endX, endY, distX, distY, angle;
    public Move() {}

    public void move(double startX, double startY, double endX, double endY, double speed)
    {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        distX = startX - endX;
        distY = startY - endY;
        angle = Math.atan2(distY, distX);
        if(this.getCenterX() != endX)
            this.setCenterX(this.getCenterX() + (1 * speed * Math.cos(angle + 180)));
        if(this.getCenterY() != endY)
            this.setCenterY(this.getCenterY() + (1 * speed * Math.sin(angle + 180)));
    }
}

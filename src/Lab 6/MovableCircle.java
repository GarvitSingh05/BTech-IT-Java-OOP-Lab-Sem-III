public class MovableCircle implements Movable { 
private MovablePoint center; 
private int radius;
 
public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
    super();
    center = new MovablePoint(x, y, xSpeed, ySpeed);
    this.radius = radius;
}

public MovableCircle(int x, int y, int xSpeed, int ySpeed) {
    super();
    center = new MovablePoint(x, y, xSpeed);
}

@Override
public void moveUp() {
    center.y -= center.ySpeed;
    }

@Override
public void moveRight() {
    center.x += center.xSpeed;
    }
}
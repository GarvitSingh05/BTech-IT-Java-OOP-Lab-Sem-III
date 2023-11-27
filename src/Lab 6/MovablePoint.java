public class MovablePoint implements Movable {
    // Private membet variables
    public int x, y, z; // (x, y, z) coordinates of the point

    // Constructor
    public MovablePoint(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "Point at (" + x + "," + y + "," + z + ")";
    }
    // Implement abstract methods defined in the interface Movable

    public void moveUp() {
        y--;
    }

    public void moveDown() {
        y++;
    }

    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }
}
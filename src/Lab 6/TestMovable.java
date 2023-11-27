public class TestMovable {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 5);
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);
    }
}
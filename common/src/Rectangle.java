package src;

public class Rectangle {

    private Point topLeft = new Point(0, 0);
    private Point rightBottom = new Point(0, 0);

    public Rectangle() {
        this.topLeft = new Point(0, 0);
        this.rightBottom = new Point(0, 0);
    }

    public Rectangle(Point topLeft, Point rightBottom) {
        this.topLeft = topLeft;
        this.rightBottom = rightBottom;
    }

    public Rectangle(int x1, int y1, int x2, int y2) {
        this.topLeft.setX(x1);
        this.topLeft.setY(y1);
        this.rightBottom.setX(x2);
        this.rightBottom.setY(y2);
    }

    public void setTLPoint(Point topLeft) {
        this.topLeft = topLeft;
    }

    public void setRBPoint(Point rightBottom) {
        this.rightBottom = rightBottom;
    }

    public void setTLPoint(int x, int y) {
        this.topLeft.setX(x);
        this.topLeft.setY(y);
    }

    public void setRBPoint(int x, int y) {
        this.rightBottom.setX(x);
        this.rightBottom.setY(y);
    }

    public Point getTLPoint() {
        return this.topLeft;
    }

    public Point getRBPoint() {
        return this.rightBottom;
    }

    public int getArea() {
        return getLength() * getWidth();
    }

    public int getPerimeter() {
        return (getLength() + getWidth()) << 1;
    }

    public int getLength() {
        return Math.abs(this.topLeft.getX() - this.rightBottom.getX());
    }

    public int getWidth() {
        return Math.abs(this.topLeft.getY() - this.rightBottom.getY());
    }
}
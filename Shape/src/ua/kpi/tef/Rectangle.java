package ua.kpi.tef;

/**
 * Created by User on 07.04.2016.
 */
public class Rectangle extends Shape {
    private Point leftTop;// = new Point();
    private Point rightBottom;// = new Point();

    public Rectangle(Point leftTop, Point rightBottom) {
        this.leftTop = leftTop;
        this.rightBottom = rightBottom;
    }

    public Rectangle(double left, double top, double right
            , double bottom) {
        this.leftTop = new Point(left, top);
        this.rightBottom = new Point(right, bottom);
    }

    @Override
    public void move(double dx, double dy) {
        leftTop.setX(leftTop.getX() + dx);
        leftTop.setY(leftTop.getY() + dy);
        rightBottom.setX(rightBottom.getX() + dx);
        rightBottom.setY(rightBottom.getY() + dy);
    }

    @Override
    public double perimeter() {
        return 2. * (Math.abs(rightBottom.getX() - leftTop.getX()) +
                Math.abs(rightBottom.getY() - leftTop.getY()));
    }

    @Override
    public double square() {
        return Math.abs((rightBottom.getX() - leftTop.getX()) *
                (rightBottom.getY() - leftTop.getY()));
    }

    public Point getRightBottom() {
        return rightBottom;
    }

    public void setRightBottom(Point rightBottom) {
        this.rightBottom = rightBottom;
    }

    public Point getLeftTop() {
        return leftTop;
    }

    public void setLeftTop(Point leftTop) {
        this.leftTop = leftTop;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "leftTop=" + leftTop +
                ", rightBottom=" + rightBottom +
                '}';
    }


    @Override
    public Rectangle clone() {
        try {
            Rectangle temp = (Rectangle) super.clone();
            temp.leftTop = (Point) this.leftTop.clone();
            temp.rightBottom = (Point) this.rightBottom.clone();
            return temp;


        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        if (!leftTop.equals(rectangle.leftTop)) return false;
        return rightBottom != null ? rightBottom.equals(rectangle.rightBottom) : rectangle.rightBottom == null;
    }

    @Override
    public int hashCode() {
        int result = (leftTop != null ? leftTop.hashCode() : 0);
        result = 31 * result + (rightBottom != null ? rightBottom.hashCode() : 0);
        return result;
    }

}

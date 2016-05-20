package ua.kpi.tef;

import java.util.ArrayList;

/**
 * Created by User on 07.04.2016.
 */
public class Circle extends Shape  {
    private Point centerCircle;
    private double radius;

    public Circle(Point centerCircle, double radius) {
        this.centerCircle = centerCircle;
        checkRadius(radius);
    }

    public Circle(double x, double y, double radius) {
        this.centerCircle = new Point(x, y);
        checkRadius(radius);
    }

    private void checkRadius(double radius) throws IllegalArgumentException {
        if (radius <= 0) {
            throw new IllegalArgumentException("radius must be greater then 0");
        }
        this.radius = radius;
    }

    @Override
    public void move(double dx, double dy) {
        centerCircle.setX(centerCircle.getX() + dx);
        centerCircle.setY(centerCircle.getY() + dy);
    }

    @Override
    public double square() {
        return 3.14 * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * radius;
    }

    public Point getCenterCircle() {
        return centerCircle;
    }

    public void setCenterCircle(Point centerCircle) {
        this.centerCircle = centerCircle;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        checkRadius(radius);
    }

    @Override
    public Circle clone()  {
        try {
            Circle temp = (Circle) super.clone();
            temp.centerCircle = (Point) this.centerCircle.clone();
            return temp;


        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        if (Double.compare(circle.getRadius(), getRadius()) != 0) return false;
        return centerCircle != null ? centerCircle.equals(circle.centerCircle) : circle.centerCircle == null;


    }

    @Override
    public int hashCode() {
        int result;
        long temp;
                temp = Double.doubleToLongBits(getRadius());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (centerCircle != null ? centerCircle.hashCode() : 0);
        return result;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "centerCircle=" + centerCircle +
                ", radius=" + radius +
                '}';
    }
}

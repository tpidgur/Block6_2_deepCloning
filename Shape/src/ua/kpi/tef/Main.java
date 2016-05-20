package ua.kpi.tef;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(3, 3);
        Circle circle1 = new Circle(p1, 4);
        Circle circle2 = circle1.clone();
        System.out.println(circle1 == circle2);
        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.hashCode());
        System.out.println(circle2.hashCode());
        System.out.println(circle1.hashCode() == circle2.hashCode());
        System.out.println("==============================");
        Point p2 = new Point(5, 5);
        circle1.setCenterCircle(p2);
        System.out.println(circle1 == circle2);
        System.out.println(circle1.equals(circle2));
        System.out.println(circle1.hashCode());
        System.out.println(circle2.hashCode());
        System.out.println(circle1.hashCode() == circle2.hashCode());
        System.out.println("==============================");

        Rectangle rectangle1 = new Rectangle(p1, p2);
        Rectangle rectangle2 = rectangle1.clone();
        System.out.println(rectangle1 == rectangle2);
        System.out.println(rectangle1.equals(rectangle2));
        System.out.println(rectangle1.hashCode());
        System.out.println(rectangle2.hashCode());
        System.out.println(rectangle1.hashCode() == rectangle2.hashCode());
        System.out.println("==============================");

        Point p3 = new Point(7, 7);
        rectangle1.setLeftTop(p3);
        System.out.println(rectangle1 == rectangle2);
        System.out.println(rectangle1.equals(rectangle2));
        System.out.println(rectangle1.hashCode());
        System.out.println(rectangle2.hashCode());
        System.out.println(rectangle1.hashCode() == rectangle2.hashCode());
        System.out.println("==============================");


    }
}

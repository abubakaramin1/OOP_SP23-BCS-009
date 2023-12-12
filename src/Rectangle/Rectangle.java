package Rectangle;

public class Rectangle {
    private double length;
    private double width;
    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area() {
        return this.length * this.width;
    }

    public double perimeter() {
        return 2.0 * this.length * this.width;
    }

    Rectangle(double length, double width, double x, double y) {
        this.setWidth(width);
        this.setLength(length);
        this.setX(x);
        this.setY(y);
    }

    public static void comparison(Rectangle r1, Rectangle r2) {
        if (r1.area() > r2.area()) {
            System.out.println("Rectangle.Rectangle 1 is greater than Rectangle.Rectangle 2");
        } else {
            System.out.println("Rectangle.Rectangle 2 is greater than Rectangle.Rectangle 1");
        }

    }

    public static void isOverlapping(Rectangle r1, Rectangle r2) {
        boolean xOverlap = r1.getX() + r1.getLength() > r2.getX() && r2.getX() + r2.getLength() > r1.getX();
        boolean yOverlap = r1.getY() + r1.getWidth() > r2.getY() && r2.getY() + r2.getWidth() > r1.getY();
        if (xOverlap && yOverlap) {
            System.out.println("They overlap");
        } else {
            System.out.println("They don't overlap");
        }

    }


}

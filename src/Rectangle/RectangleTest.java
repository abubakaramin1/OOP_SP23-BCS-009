package Rectangle;

import Rectangle.Rectangle;

class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(15.5, 20.5, 5.0, 8.0);
        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        Rectangle r2 = new Rectangle(16.5, 25.5, 4.0, 7.0);
        Rectangle.comparison(r1, r2);
        Rectangle.isOverlapping(r1, r2);
    }
}

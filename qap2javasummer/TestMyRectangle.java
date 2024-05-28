public class TestMyRectangle {
    public static void main(String[] args) {
        // Create MyPoint instances
        MyPoint p1 = new MyPoint(1, 4);
        MyPoint p2 = new MyPoint(5, 1);

        // Create MyRectangle instances using different constructors
        MyRectangle rect1 = new MyRectangle(1, 4, 5, 1);
        MyRectangle rect2 = new MyRectangle(p1, p2);

        // Test getters and setters
        System.out.println("Rect1 Top-Left: " + rect1.getTopLeft());      // (1, 4)
        System.out.println("Rect1 Bottom-Right: " + rect1.getBottomRight()); // (5, 1)

        rect1.setTopLeft(new MyPoint(0, 3));
        rect1.setBottomRight(new MyPoint(4, 0));
        System.out.println("Updated Rect1: " + rect1);                    // MyRectangle [topLeft=(0, 3), bottomRight=(4, 0)]

        // Test width, height, area, and perimeter
        System.out.println("Rect1 Width: " + rect1.getWidth());           // 4
        System.out.println("Rect1 Height: " + rect1.getHeight());         // 3
        System.out.println("Rect1 Area: " + rect1.getArea());             // 12
        System.out.println("Rect1 Perimeter: " + rect1.getPerimeter());   // 14

        // Test individual coordinate getters and setters
        rect1.setTopLeftX(1);
        rect1.setTopLeftY(4);
        rect1.setBottomRightX(5);
        rect1.setBottomRightY(1);
        System.out.println("Updated Rect1: " + rect1);                    // MyRectangle [topLeft=(1, 4), bottomRight=(5, 1)]
    }
}

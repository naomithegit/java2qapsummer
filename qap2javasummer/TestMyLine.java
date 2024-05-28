public class TestMyLine {
    public static void main(String[] args) {
        // Create MyPoint instances
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);

        // Create MyLine instances using different constructors
        MyLine line1 = new MyLine(1, 2, 4, 6);
        MyLine line2 = new MyLine(p1, p2);

        // Test getters and setters
        System.out.println("Line1 Begin: " + line1.getBegin()); // (1, 2)
        System.out.println("Line1 End: " + line1.getEnd());     // (4, 6)

        line1.setBegin(new MyPoint(0, 0));
        line1.setEnd(new MyPoint(3, 4));
        System.out.println("Updated Line1: " + line1);          // MyLine [begin=(0, 0), end=(3, 4)]

        // Test length and gradient
        System.out.println("Line1 Length: " + line1.getLength()); // 5.0
        System.out.println("Line1 Gradient: " + Math.toDegrees(line1.getGradient())); // 53.13010235415599 (in degrees)

        // Test individual coordinate getters and setters
        line1.setBeginX(1);
        line1.setBeginY(1);
        line1.setEndX(4);
        line1.setEndY(5);
        System.out.println("Updated Line1: " + line1);          // MyLine [begin=(1, 1), end=(4, 5)]

        // Test array getters and setters
        line1.setBeginXY(2, 2);
        line1.setEndXY(6, 6);
        System.out.println("Updated Line1: " + line1);          // MyLine [begin=(2, 2), end=(6, 6)]
    }
}

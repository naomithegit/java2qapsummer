public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructors
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getters and setters for top-left and bottom-right points
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Getters and setters for individual coordinates of top-left and bottom-right points
    public int getTopLeftX() {
        return topLeft.getX();
    }

    public void setTopLeftX(int x) {
        topLeft.setX(x);
    }

    public int getTopLeftY() {
        return topLeft.getY();
    }

    public void setTopLeftY(int y) {
        topLeft.setY(y);
    }

    public int getBottomRightX() {
        return bottomRight.getX();
    }

    public void setBottomRightX(int x) {
        bottomRight.setX(x);
    }

    public int getBottomRightY() {
        return bottomRight.getY();
    }

    public void setBottomRightY(int y) {
        bottomRight.setY(y);
    }

    // Get width of the rectangle
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Get height of the rectangle
    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    // Calculate the area of the rectangle
    public int getArea() {
        return getWidth() * getHeight();
    }

    // Calculate the perimeter of the rectangle
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    @Override
    public String toString() {
        return "MyRectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}

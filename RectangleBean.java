import java.io.Serializable;

public class RectangleBean implements Serializable {
    private double length;
    private double width;

    public RectangleBean() {}

    public RectangleBean(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }

    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        RectangleBean rect = new RectangleBean(5.0, 3.0);
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}

import java.io.Serializable;

public class CircleBean implements Serializable {
    private double radius;

    public CircleBean() {}

    public CircleBean(double radius) {
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    // Read-only property for Area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Read-only property for Circumference
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        CircleBean circle = new CircleBean(5.0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.printf("Area: %.2f
", circle.getArea());
        System.out.printf("Circumference: %.2f
", circle.getCircumference());
    }
}

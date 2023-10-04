public class Circle extends Shape {
    private double radius;

    Circle(String name) {
        super(name);

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * (radius * radius);
    }

    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }
}

abstract class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
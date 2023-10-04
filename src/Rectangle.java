public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name) {
        super(name);

    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }



}

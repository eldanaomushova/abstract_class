public class Square extends Rectangle {
    private double side;

    public Square(String name) {
        super(name);

    }

    public void setSide(double side) {
        this.side = side;
    }
    public double getArea() {
        return Math.pow(side, 2);
    }

    public double getPerimeter() {
        return 2 * side;
    }


}

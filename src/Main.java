import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose number for 1. Rectangle, 2. Circle, 3. Triangle, 4. Square");
        int type = scanner.nextInt();
        boolean continueProgram = true;
        while (continueProgram){
            switch (type) {
                case 1:
                    Rectangle r = new Rectangle("Rectangle");
                    System.out.print("Enter width: ");
                    double width = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double height = scanner.nextDouble();
                    r.setWidth(width);
                    r.setHeight(height);
                    System.out.println("The Perimeter of " + r.name + " is " + r.getPerimeter());
                    System.out.println("The Area of " + r.name + " is " + r.getArea());
                    break;
                case 2:
                    Circle c = new Circle("Circle");
                    System.out.print("Enter radius: ");
                    double radius = scanner.nextDouble();
                    c.setRadius(radius);
                    System.out.println("The Perimeter of " + c.name + " is " + c.getPerimeter());
                    System.out.println("The Area of " + c.name + " is " + c.getArea());
                    break;
                case 3:
                    Triangle t = new Triangle("Triangle");
                    System.out.print("Enter side 1: ");
                    double side1 = scanner.nextDouble();
                    System.out.print("Enter side 2: ");
                    double side2 = scanner.nextDouble();
                    System.out.print("Enter side 3: ");
                    double side3 = scanner.nextDouble();
                    t.setSide1(side1);
                    t.setSide2(side2);
                    t.setSide3(side3);
                    System.out.println("The Perimeter of " + t.name + " is " + t.getPerimeter());
                    System.out.println("The Area of " + t.name + " is " + t.getArea());
                    break;
                case 4:
                    Square s = new Square("Square");
                    System.out.print("Enter side: ");
                    double side = scanner.nextDouble();
                    s.setSide(side);
                    System.out.println("The Perimeter of " + s.name + " is " + s.getPerimeter());
                    System.out.println("The Area of " + s.name + " is " + s.getArea());
                    break;
                default:
                    System.out.println("You entered wrong number!");

            }
            System.out.println("Do you want to continue? Y/n");
            String userInputContinue = scanner.next().toLowerCase();
            if(userInputContinue.equals("n")){
                continueProgram = false;
            }
        }
        scanner.close();
    }
    }

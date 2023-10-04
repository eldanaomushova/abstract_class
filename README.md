# Abstract_class_shape
## Create an abstract class called "Shape" with the following attributes and methods:

   - Attributes:

     - name(String): A variable to store the name of the shape.

   - Abstract Methods:

     - double getArea(): An abstract method that calculates and returns the area of the shape.

     - double getPerimeter(): An abstract method that calculates and returns the perimeter of the shape.

## Create a class called "Rectangle" that extends the "Shape" class. The "Rectangle" class should have the following attributes and methods:

   - Attributes:

     - width (double): The width of the rectangle.

     - height (double): The height of the rectangle.

   - Implement the getArea() and getPerimeter() methods for rectangles.



## Create a class called "Circle" that extends the "Shape" class. The "Circle" class should have the following attributes and methods:

   - Attributes:

     - radius (double): The radius of the circle.

   - Implement the getArea() and getPerimeter() methods for circles.



## Create a class called "Triangle" that extends the "Shape" class. The "Triangle" class should have the following attributes and methods:

   - Attributes:

     - side1, side2, side3 (double) - Represents the lengths of the triangle's sides.

   - Implement the getArea() and getPerimeter() methods for any kind of triangles.



## Create a class called "Square" that extends the "Rectangle" class. The "Square" class should inherit attributes and methods from the "Rectangle" class but should also implement a constructor that takes a single side length as an argument.



## Implement a user interactive program that does the following:

   - Allows the user to choose a shape type (Rectangle, Circle, Triangle or Square).

   - Based on the selected shape type, prompt the user for the necessary dimensions (e.g., length, width, radius).

   - Calculate and display the area and perimeter of the selected shape.

   - Repeat the process until the user chooses to exit the program.

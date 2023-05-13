// class Circle implements Shape and overrides methods to calculate area and perimeter
public class Circle extends Shape {
    // variable for radius
    int radius;

    // declaring constant to store the value of pi which will be used to calculate area and perimeter
    private static final double PI = 3.14;

    // constructor that initializes Circle with color and radius
    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    // method to calculate area. area of circle = pi * (radius)²
    @Override
    double calculateArea() {
        return PI * radius * radius;
    }

    // method to calculate perimeter. perimeter of circle = 2 * pi * radius
    @Override
    double calculatePerimeter() {
        return 2 * PI * radius;
    }
}

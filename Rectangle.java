// class Rectangle implements Shape and overrides methods to calculate area and perimeter
public class Rectangle extends Shape {
    // variable for width
    int width;

    // variable for height
    int height;

    // constructor that initializes Rectangle with color, width and height
    public Rectangle(String color, int width, int height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    // method to calculate area. area of rectangle = width * height
    @Override
    double calculateArea() {
        return width * height;
    }

    // method to calculate perimeter. perimeter of rectangle = 2 * (width + height)
    @Override
    double calculatePerimeter() {
        return 2 * (width + height);
    }
}

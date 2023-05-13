// abstract class Shape which has variable color and 2 abstract methods
// Once extended, any child class will have to override the methods
// The child class provides its own implementation to calculate area and perimeter
abstract class Shape {
    String color;

    abstract double calculateArea();

    abstract double calculatePerimeter();
}

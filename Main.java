public class Main {

    public static void main(String[] args) {

        // creating 5 Shape objects with different color

        // 3 Shape objects are rectangle
        Shape shape1 = new Rectangle("Red", 2, 4);
        Shape shape2 = new Rectangle("Green", 5, 8);
        Shape shape3 = new Rectangle("Blue", 4, 9);

        // 2 Shape objects are Circle
        Shape shape4 = new Circle("Black", 5);
        Shape shape5 = new Circle("White", 7);

        // creating an array of Shape object with all 5 Shape objects created earlier
        Shape[] shapes = {shape1, shape2, shape3, shape4, shape5};

        // defining a format to print with spacing
        String format = "| %-10s | %-10s | %-10s |";

        // printing the header
        System.out.println("+--------------------------------------+");
        System.out.format(format, "Color", "Area", "Perimeter");
        System.out.println();
        System.out.print("+--------------------------------------+");

        // using for loop to loop through every element in shapes array
        for (int i = 0; i < shapes.length; i++) {
            System.out.println();

            // calculating the area of shape
            double area = shapes[i].calculateArea();

            // calculating the perimeter of shape
            double perimeter = shapes[i].calculatePerimeter();

            // printing color
            // printing area and perimeter formatting double to 2 decimal place string
            System.out.format(format, shapes[i].color, String.format("%.2f", area), String.format("%.2f", perimeter));
        }

        // printing the footer
        System.out.println();
        System.out.print("+--------------------------------------+");
    }
}
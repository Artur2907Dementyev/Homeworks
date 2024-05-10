package lesson25.classwork0805.HW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the shape of the plot (rectangle/circle/polygon):");
        String shapeType = scanner.nextLine();

        double perimeter = 0.0;

        switch (shapeType.toLowerCase()) {
            case "rectangle":
                System.out.print("Enter length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width of the rectangle: ");
                double width = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                perimeter = rectangle.getSquare();
                break;

            case "circle":
                System.out.print("Enter radius of the circle: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                perimeter = circle.getSquare();
                break;

            case "polygon":
                System.out.print("Enter number of sides of the polygon: ");
                int sides = scanner.nextInt();
                System.out.print("Enter length of one side of the polygon: ");
                double sideLength = scanner.nextDouble();
                RegularPolygon polygon = new RegularPolygon(sides, sideLength);
                perimeter = polygon.getSquare();
                break;

            default:
                System.out.println("Invalid shape type. Please enter 'rectangle', 'circle', or 'polygon'.");

        }

        System.out.print("Enter price per meter of fence: ");
        double pricePerMeter = scanner.nextDouble();

        System.out.println("\n==== Price ==========");
        double totalPrice = perimeter * pricePerMeter;
        System.out.println("Total price of the fence: €" + totalPrice);
    }
}

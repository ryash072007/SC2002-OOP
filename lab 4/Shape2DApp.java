import java.util.Scanner;

public class Shape2DApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("2D Shape Area Calculator");
        System.out.println("1. Use sample figure from lab sheet");
        System.out.println("2. Enter my own shapes");
        System.out.print("Choose option: ");
        int option = scanner.nextInt();

        Shape[] shapes;

        if (option == 1) {
            shapes = new Shape[3];
            shapes[0] = new Circle(10);
            shapes[1] = new Triangle(20, 25);
            shapes[2] = new Rectangle(50, 20);
        } else {
            System.out.print("Enter total number of shapes: ");
            int totalShapes = scanner.nextInt();
            shapes = new Shape[totalShapes];

            for (int i = 0; i < totalShapes; i++) {
                System.out.println("\nChoose shape " + (i + 1) + ":");
                System.out.println("1. Square");
                System.out.println("2. Rectangle");
                System.out.println("3. Circle");
                System.out.println("4. Triangle");
                System.out.print("Your choice: ");
                int shapeChoice = scanner.nextInt();

                switch (shapeChoice) {
                    case 1:
                        System.out.print("Enter side: ");
                        double side = scanner.nextDouble();
                        shapes[i] = new Square(side);
                        break;
                    case 2:
                        System.out.print("Enter length: ");
                        double length = scanner.nextDouble();
                        System.out.print("Enter breadth: ");
                        double breadth = scanner.nextDouble();
                        shapes[i] = new Rectangle(length, breadth);
                        break;
                    case 3:
                        System.out.print("Enter radius: ");
                        double radius = scanner.nextDouble();
                        shapes[i] = new Circle(radius);
                        break;
                    case 4:
                        System.out.print("Enter base: ");
                        double base = scanner.nextDouble();
                        System.out.print("Enter height: ");
                        double height = scanner.nextDouble();
                        shapes[i] = new Triangle(base, height);
                        break;
                    default:
                        System.out.println("Invalid choice. Defaulting to Square(side=1).");
                        shapes[i] = new Square(1);
                        break;
                }
            }
        }

        System.out.println("\nChoose type of calculation:");
        System.out.println("1. Area");
        System.out.print("Your choice: ");
        int calcChoice = scanner.nextInt();

        if (calcChoice == 1) {
            double totalArea = 0;
            System.out.println("\nArea details:");
            for (Shape shape : shapes) {
                double area = shape.calculateArea();
                totalArea += area;
                System.out.printf("%s area = %.2f%n", shape.getShapeName(), area);
            }
            System.out.printf("\nTotal 2D figure area = %.2f%n", totalArea);
        } else {
            System.out.println("Only area is supported for now.");
        }

        scanner.close();
    }
}

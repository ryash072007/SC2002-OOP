import java.util.Scanner;

public class Shape3DApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("3D Shape Surface Area Calculator");
        System.out.println("1. Use sample set: Sphere + Pyramid + Cuboid");
        System.out.println("2. Use sample set: Sphere + Cone + Cylinder");
        System.out.println("3. Enter my own 3D shapes");
        System.out.print("Choose option: ");
        int option = scanner.nextInt();

        Shape[] shapes;

        if (option == 1) {
            shapes = new Shape[3];
            shapes[0] = new Sphere(10);
            shapes[1] = new Pyramid(20, 20, 25);
            shapes[2] = new Cuboid(50, 20, 25);
        } else if (option == 2) {
            shapes = new Shape[3];
            shapes[0] = new Sphere(10);
            shapes[1] = new Cone(10, 25);
            shapes[2] = new Cylinder(10, 50);
        } else {
            System.out.print("Enter total number of shapes: ");
            int totalShapes = scanner.nextInt();
            shapes = new Shape[totalShapes];

            for (int i = 0; i < totalShapes; i++) {
                System.out.println("\nChoose 3D shape " + (i + 1) + ":");
                System.out.println("1. Sphere");
                System.out.println("2. Cuboid");
                System.out.println("3. Cone");
                System.out.println("4. Cylinder");
                System.out.print("Your choice: ");
                int shapeChoice = scanner.nextInt();

                switch (shapeChoice) {
                    case 1:
                        System.out.print("Enter radius: ");
                        double sRadius = scanner.nextDouble();
                        shapes[i] = new Sphere(sRadius);
                        break;
                    case 2:
                        System.out.print("Enter length: ");
                        double length = scanner.nextDouble();
                        System.out.print("Enter breadth: ");
                        double breadth = scanner.nextDouble();
                        System.out.print("Enter height: ");
                        double height = scanner.nextDouble();
                        shapes[i] = new Cuboid(length, breadth, height);
                        break;
                    case 3:
                        System.out.print("Enter radius: ");
                        double cRadius = scanner.nextDouble();
                        System.out.print("Enter height: ");
                        double cHeight = scanner.nextDouble();
                        shapes[i] = new Cone(cRadius, cHeight);
                        break;
                    case 4:
                        System.out.print("Enter radius: ");
                        double yRadius = scanner.nextDouble();
                        System.out.print("Enter height: ");
                        double yHeight = scanner.nextDouble();
                        shapes[i] = new Cylinder(yRadius, yHeight);
                        break;
                    default:
                        System.out.println("Invalid choice. Defaulting to Sphere(radius=1).");
                        shapes[i] = new Sphere(1);
                        break;
                }
            }
        }

        System.out.println("\nChoose type of calculation:");
        System.out.println("1. Surface Area");
        System.out.print("Your choice: ");
        int calcChoice = scanner.nextInt();

        if (calcChoice == 1) {
            double totalArea = 0;
            System.out.println("\nSurface area details:");
            for (Shape shape : shapes) {
                double area = shape.calculateArea();
                totalArea += area;
                System.out.printf("%s surface area = %.2f%n", shape.getShapeName(), area);
            }
            System.out.printf("\nTotal 3D figure surface area = %.2f%n", totalArea);
        } else {
            System.out.println("Only surface area is supported for now.");
        }

        scanner.close();
    }
}

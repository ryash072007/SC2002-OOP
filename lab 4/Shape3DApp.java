import java.util.Scanner;

public class Shape3DApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your own 3D shapes");
        System.out.print("Enter total number of shapes: ");
        int totalShapes = scanner.nextInt();
        Shape[] shapes = new Shape[totalShapes];
        for (int i = 0; i < totalShapes; i++) {
            System.out.println("\nChoose 3D shape " + (i + 1) + ":");
            System.out.println("1. Sphere");
            System.out.println("2. Cuboid");
            System.out.println("3. Square-based Pyramid");
            System.out.println("4. Cone");
            System.out.println("5. Cylinder");
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
                    System.out.print("Enter base side: ");
                    double pBaseSide = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double pHeight = scanner.nextDouble();
                    shapes[i] = new Pyramid(pBaseSide, pHeight);
                    break;
                case 4:
                    System.out.print("Enter radius: ");
                    double cRadius = scanner.nextDouble();
                    System.out.print("Enter height: ");
                    double cHeight = scanner.nextDouble();
                    shapes[i] = new Cone(cRadius, cHeight);
                    break;
                case 5:
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

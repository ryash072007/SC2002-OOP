public class Cylinder implements Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        Shape topCircle = new Circle(radius);
        Shape bottomCircle = new Circle(radius);
        Shape curvedSurface = new Rectangle(2 * Math.PI * radius, height);

        return topCircle.calculateArea() + bottomCircle.calculateArea() + curvedSurface.calculateArea();
    }

    @Override
    public String getShapeName() {
        return "Cylinder";
    }
}

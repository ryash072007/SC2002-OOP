public class Cone implements Shape {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        Shape baseCircle = new Circle(radius);
        double slantHeight = Math.sqrt(radius * radius + height * height);
        double curvedSurfaceArea = Math.PI * radius * slantHeight;

        return baseCircle.calculateArea() + curvedSurfaceArea;
    }

    @Override
    public String getShapeName() {
        return "Cone";
    }
}

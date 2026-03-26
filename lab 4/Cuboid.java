public class Cuboid implements Shape {
    private double length;
    private double breadth;
    private double height;

    public Cuboid(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        Shape faceLB = new Rectangle(length, breadth);
        Shape faceLH = new Rectangle(length, height);
        Shape faceBH = new Rectangle(breadth, height);

        return 2 * faceLB.calculateArea() + 2 * faceLH.calculateArea() + 2 * faceBH.calculateArea();
    }

    @Override
    public String getShapeName() {
        return "Cuboid";
    }
}

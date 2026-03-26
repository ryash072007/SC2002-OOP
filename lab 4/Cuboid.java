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
        return 2 * (length * breadth + length * height + breadth * height);
    }

    @Override
    public String getShapeName() {
        return "Cuboid";
    }
}

public class Pyramid implements Shape {
    private double baseSide;
    private double height;

    public Pyramid(double baseSide, double height) {
        this.baseSide = baseSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double slantHeight = Math.sqrt((baseSide / 2.0) * (baseSide / 2.0) + height * height);

        Shape baseFace = new Square(baseSide);
        Shape sideFace = new Triangle(baseSide, slantHeight);

        return baseFace.calculateArea()
                + 4 * sideFace.calculateArea();
    }

    @Override
    public String getShapeName() {
        return "Square-based Pyramid";
    }
}

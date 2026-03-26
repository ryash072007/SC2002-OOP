public class Pyramid implements Shape {
    private double baseLength;
    private double baseWidth;
    private double height;

    public Pyramid(double baseLength, double baseWidth, double height) {
        this.baseLength = baseLength;
        this.baseWidth = baseWidth;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double slantHeightLength = Math.sqrt((baseWidth / 2.0) * (baseWidth / 2.0) + height * height);
        double slantHeightWidth = Math.sqrt((baseLength / 2.0) * (baseLength / 2.0) + height * height);

        double baseArea = baseLength * baseWidth;
        double sideArea1 = baseLength * slantHeightLength;
        double sideArea2 = baseWidth * slantHeightWidth;

        return baseArea + sideArea1 + sideArea2;
    }

    @Override
    public String getShapeName() {
        return "Square-based Pyramid";
    }
}

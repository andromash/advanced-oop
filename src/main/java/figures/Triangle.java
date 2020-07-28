package figures;

public class Triangle extends Shape {
    private final String NAME = "Triangle";
    private double side1;
    private double side2;
    private Color color;

    public Triangle(double side1, double side2, Color color) {
        this.side1 = side1;
        this.side2 = side2;
        this.color = color;
    }

    public String getNAME() {
        return NAME;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public float getHypotenuse() {
        return (float) Math.sqrt(side1 * side1 + side2 * side2);
    }

    public String draw() {
        return "Shape: " + getNAME() + ", area: " + getArea() + ", hypotenuse: " + getHypotenuse() + " inch, color: " + getColor();
    }

    public double getArea() {
        return 0.5 * side1 * side2;
    }

    @Override
    public Color getColor() {
        return color;
    }
}

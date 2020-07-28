package figures;

public class Trapeze extends Shape {
    private final String NAME = "Trapeze";
    private double middleLine, height;
    private Color color;

    public Trapeze(double middleLine, double height, Color color) {
        this.middleLine = middleLine;
        this.height = height;
        this.color = color;
    }

    public String draw() {
        return "Shape: " + getNAME() + ", area: " + getArea() + ", middle line: " + getMiddleLine() + " inch, height" + getHeight() + " inch, color: " + getColor();
    }

    public double getArea() {
        return middleLine * height;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public String getNAME() {
        return NAME;
    }

    public double getMiddleLine() {
        return middleLine;
    }

    public double getHeight() {
        return height;
    }
}

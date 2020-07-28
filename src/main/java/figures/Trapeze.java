package figures;

public class Trapeze extends Shape {
    private final String NAME = "Trapeze";
    private float middleLine, height;
    private Color color;

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

    public float getMiddleLine() {
        return middleLine;
    }

    public float getHeight() {
        return height;
    }
}

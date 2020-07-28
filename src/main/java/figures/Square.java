package figures;

public class Square extends Shape {
    private final String NAME = "Square";
    private double side;
    private Color color;

    public Square(double side, Color color) {
        this.side = side;
        this.color = color;
    }

    public String getNAME() {
        return NAME;
    }

    public double getSide() {
        return side;
    }

    public String draw() {
        return "Shape: " + getNAME() + ", area: " + getArea() + ", side: " + getSide() + " inch, color: " + getColor();
    }

    public double getArea() {
        return this.getSide() * this.getSide();
    }

    public Color getColor() {
        return color;
    }
}

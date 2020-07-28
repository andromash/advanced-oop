package figures;

public class Round extends Shape {
    private final String NAME = "Round";
    private double radius;

    public Round(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    public String draw() {
        return "Shape: " + getNAME() + ", area: " + getArea() + ", radius: " + getRadius() + " inch, color: " + getColor();
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String getNAME() {
        return NAME;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public Color getColor() {
        return color;
    }
}

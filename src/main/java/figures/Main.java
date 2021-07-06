package figures;

public class Main {
    public static void main(String[] args) {
        int size = (int) (Math.random() * 100);
        Shape[] shapes = new Shape[size];

        for (int i = 0; i < size; i++) {
            int random = (int) (Math.random() * 4);
            switch (random) {
                case 0:
                    shapes[i] = new Round(Math.random() * 10, Color.randomColor());
                    break;
                case 1:
                    shapes[i] = new Square(Math.random() * 10, Color.randomColor());
                    break;
                case 2:
                    shapes[i] = new Trapeze(Math.random() * 10, Math.random() * 10, Color.randomColor());
                    break;
                case 3:
                    shapes[i] = new Triangle(Math.random() * 10, Math.random() * 10, Color.randomColor());
                    break;
            }
        }
        for (Shape shape : shapes) {
            System.out.println(shape.draw());
        }
    }
}

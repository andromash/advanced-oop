package figures;

public enum Color {
    GREEN,
    RED,
    BLUE,
    BLACK,
    WHITE,
    YELLOW,
    PURPLE;

    public static Color getRandomColor() {
        int random = (int) (Math.random() * 7);
        return values()[random];

    }
}

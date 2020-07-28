package figures;

public enum Color {
    GREEN,
    RED,
    BLUE,
    BLACK,
    WHITE,
    YELLOW,
    PURPLE;

    public static Color randomColor(){
        int random = (int)(Math.random() * 6);
        switch (random) {
            case 0:
                return GREEN;
            case 1:
                return RED;
            case 2:
                return BLUE;
            case 3:
                return BLACK;
            case 4:
                return WHITE;
            case 5:
                return YELLOW;
            case 6:
                return PURPLE;
        }
        return null;
    }
}

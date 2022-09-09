package nl.han.ica.oose.dea;

public enum ProductColor {
    BLUE(1),RED(2), YELLOW(3), NO_COLOR(-1);

    private final int val;

    ProductColor(int v) { val = v; }

    @Override
    public String toString() {
        if (val == -1) return "no color";
        else return this.name().toLowerCase();
    }
}

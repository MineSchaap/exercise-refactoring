package nl.han.ica.oose.dea;

public enum ProductSize {
    XS(1), S(2), M(3), L(4), XL(5), XXL(6), INVALID_SIZE(-1), UNKNOWN(0);

    private final int size;

    ProductSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        if (size == -1) return "Invalid Size";
        else return this.name();
    }
}

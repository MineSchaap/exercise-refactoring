package nl.han.ica.oose.dea;

// TODO: Fix 'Data Class' smell. Does Product not have any behaviour?
public class Product {
    private String code;

    // TODO: Fix 'Primitive Obsession'. OR Fix 'Feature Envy' in OrdersWriter
    private int color;
    // TODO: Fix 'Primitive Obsession'. OR Fix 'Feature Envy' in OrdersWriter
    private int size;
    // TODO: Fix 'Primitive Obsession'. Combine price and currency. Add Price class. Could be inline.
    private double price;
    private String currency;

    public Product(String code, int color, int size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public int getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }
}

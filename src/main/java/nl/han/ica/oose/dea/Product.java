package nl.han.ica.oose.dea;

import static nl.han.ica.oose.dea.JsonBuilder.*;

public class Product {
    private String code;
    private ProductColor color;
    private ProductSize size;
    private double price;
    private String currency;

    public Product(String code, ProductColor color, ProductSize size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    @Override
    public String toString() {
        StringBuilder productAsString = new StringBuilder();
        productAsString.append(START_OBJECT);
        appendPropertyAsJsonData(productAsString, "\"code\": \"", this.code, "\", ");
        appendPropertyAsJsonData(productAsString, "\"color\": \"", this.color.toString(), "\", ");
        appendSizeOnlyIfValueIsNotUnknown(productAsString);
        appendPropertyAsJsonData(productAsString,"","\"price\": ", this.price);
        appendPropertyAsJsonData(productAsString, ", ", "\"currency\": \"", this.currency);
        productAsString.append("\"" + END_OBJECT + ", ");
        return productAsString.toString();
    }




    private void appendSizeOnlyIfValueIsNotUnknown(StringBuilder productAsString) {
        if (size != ProductSize.UNKNOWN) {
            appendPropertyAsJsonData(productAsString, "\"size\": \"", this.size.toString(), "\", ");
        }
    }
}

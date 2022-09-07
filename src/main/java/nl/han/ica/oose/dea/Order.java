package nl.han.ica.oose.dea;

import java.util.ArrayList;
import java.util.List;

import static nl.han.ica.oose.dea.JsonBuilder.*;

public class Order {
    private List<Product> products = new ArrayList<Product>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public String toString() {
        var orderAsString = new StringBuilder();
        orderAsString.append(START_OBJECT);
        appendPropertyAsJsonData(orderAsString, "\"id\": ", this.id,", ");
        orderAsString.append("\"products\": " + START_COLLECTION);

        for (Product product : products) {
            orderAsString.append(product);
        }

        removeLastCommaAndSpaceIfCollectionIsNotEmpty(orderAsString, products);

        orderAsString.append(END_COLLECTION);
        orderAsString.append(END_OBJECT + ", ");
        return orderAsString.toString();
    }


}

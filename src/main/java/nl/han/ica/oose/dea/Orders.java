package nl.han.ica.oose.dea;

import java.util.ArrayList;
import java.util.List;

import static nl.han.ica.oose.dea.JsonBuilder.*;

public class Orders {
    private final List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public String toString() {
        StringBuilder ordersToJSON =
                new StringBuilder(START_OBJECT + "\"orders\": " + START_COLLECTION);

        for (Order order : orders) {
            ordersToJSON.append(order);
        }

        removeLastCommaAndSpaceIfCollectionIsNotEmpty(ordersToJSON, orders);

        return ordersToJSON.append(END_COLLECTION + END_OBJECT).toString();
    }
}

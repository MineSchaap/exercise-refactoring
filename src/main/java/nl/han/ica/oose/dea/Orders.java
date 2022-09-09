package nl.han.ica.oose.dea;

import java.util.ArrayList;
import java.util.List;

// TODO: Fix 'speculative generality' / 'Data Class' smell. Why does this class exist? Can this not be a regular List?
// OR
// TODO: Fix 'feature envy' smell. Move some behaviour from OrdersWriter into this class.
public class Orders {
    private List<Order> orders = new ArrayList<Order>();

    public void AddOrder(Order order) {
        orders.add(order);
    }

    public int getOrdersCount() {
        return orders.size();
    }

    public Order getOrder(int i) {
        return orders.get(i);
    }
}

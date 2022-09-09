package nl.han.ica.oose.dea;

public class OrdersWriter {
    private final Orders orders;

    public OrdersWriter(Orders orders) {
        this.orders = orders;
    }

    public String getContents() {
        return orders.toString();
    }

}

public void processRow (ResultSet rs) throws SQLException {
    Long id = rs.getLong ("CUSTOMER_ID");
    Customer customer = map.get (id);
    if (customer != null) {
        List ordersList = customer.getOrders ();
        if (ordersList == null) {
            ordersList = new ArrayList < Order > ();
            customer.setOrders (ordersList);
        }
        Order order = new Order ();
        order.setId (rs.getLong ("ORDER_ID"));
        ordersList.add (order);
    }
}



 

public void processRow(ResultSet rs) throws SQLException {
    Long id = rs.getLong("CUSTOMER_ID");
    Order order = new Order();
    order.setId(rs.getLong("ORDER_ID"));
    map.computeIfPresent(id, (customerId, customerObject) -> {
            List<Order> orders = Optional.ofNullable(customerObject.getOrders())
                    .orElseGet(ArrayList::new);
            orders.add(order);
            customerObject.setOrders(orders);
            return customerObject;
    });
}



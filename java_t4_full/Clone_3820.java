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
            map.computeIfPresent(rs.getLong("CUSTOMER_ID"), (k, v) -> {
                List<Order> orders = v.getOrders() == null ? new ArrayList<>() : v.getOrders();
                orders.add(setOrder(rs));
                v.setOrders(orders);
                return v;
            });
        }
        private Order setOrder(ResultSet rs) throws SQLException {
            Order order = new Order();
            order.setId(rs.getLong("ORDER_ID"));
            return order;
}



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
    if(map.containsKey(rs.getLong("CUSTOMER_ID"))) {
        Order order = new Order();
        order.setId(rs.getLong("ORDER_ID"));
        map.get(rs.getLong("CUSTOMER_ID")).getOrders().add(order);
    }
}



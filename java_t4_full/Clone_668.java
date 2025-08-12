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


  public void processRow (ResultSet rs) throws SQLException {
    long customerId = rs.getLong ("CUSTOMER_ID");
    Customer customer = map.get (customerId); 
    if(customer != null) {
        if(customer.getOrders() == null) {
            customer.setOrders(new ArrayList < Order > ());
        }
        long orderId = rs.getLong ("ORDER_ID");
        Order order = new Order (orderId);
        customer.getOrders().add(order);
    }
}



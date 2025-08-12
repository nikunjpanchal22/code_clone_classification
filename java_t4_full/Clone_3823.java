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
            Customer customer = map.get(id);
            if(customer!=null) {
                addOrderToCustomer(rs, order);
            }
        }
        private void addOrderToCustomer(ResultSet rs, Order order) throws SQLException {
            if(order == null)
                order = new Order();
            order.setId(rs.getLong("ORDER_ID"));
            customer.getOrders().add(order);
}



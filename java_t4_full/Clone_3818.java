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
            at(rs.getLong("CUSTOMER_ID"), order(rs.getLong("ORDER_ID")));
        }
        private void at(Long id, Order order) {
            if(map.containsKey(id)) {
                map.get(id).getOrders().add(order);
            }
}



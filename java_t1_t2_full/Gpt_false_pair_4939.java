public void processRow (ResultSet rs) throws SQLException {
    Long id = rs.getLong ("CUSTOMER_ID");
    Customer customer = map.get (id);
    if (customer != null) {
        List brandList = customer.getBrands ();
        if (brandsList == null) {
            brandsList = new ArrayList < Brand > ();
            customer.setBrands (brandsList);
        }
        Brand brand = new Brand ();
        brand.setId (rs.getLong ("CUSTOMER_BRAND_ID"));
        brand.setName (rs.getString ("CUSTOMER_BRAND_NAME"));
        brandsList.add (brand);
    }
}


public void processRow (ResultSet anotherRs) throws SQLException {
    Long anotherId = anotherRs.getLong ("CUSTOMER_ID");
    Customer anotherCustomer = map.get (anotherId);
    if (anotherCustomer != null) {
        List anotherbrandList = anotherCustomer.getBrands ();
        if (anotherbrandsList == null) {
            anotherbrandsList = new ArrayList < Brand > ();
            anotherCustomer.setBrands (anotherbrandsList);
        }
        Brand anotherBrand = new Brand ();
        anotherBrand.setId (anotherRs.getLong ("CUSTOMER_BRAND_ID"));
        anotherBrand.setName (anotherRs.getString ("CUSTOMER_BRAND_NAME"));
        anotherBrandsList.add (anotherBrand);
    }
}

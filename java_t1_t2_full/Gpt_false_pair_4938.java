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


public void processRow (ResultSet clonedRs) throws SQLException {
    Long clonedId = clonedRs.getLong ("CUSTOMER_ID");
    Customer clonedCustomer = map.get (clonedId);
    if (clonedCustomer != null) {
        List clonedbrandList = clonedCustomer.getBrands ();
        if (clonedbrandsList == null) {
            clonedbrandsList = new ArrayList < Brand > ();
            clonedCustomer.setBrands (clonedbrandsList);
        }
        Brand clonedBrand = new Brand ();
        clonedBrand.setId (clonedRs.getLong ("CUSTOMER_BRAND_ID"));
        clonedBrand.setName (clonedRs.getString ("CUSTOMER_BRAND_NAME"));
        clonedBrandsList.add (clonedBrand);
    }
}

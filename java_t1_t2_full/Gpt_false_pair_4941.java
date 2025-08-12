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


public void processRow (ResultSet rs) throws SQLException {
    Long id = rs.getLong ("Customer_Identification");
    Customer customer = map.get (id);
    if (customer != null) {
        List<Brand> allBrands = customer.getBrands ();
        if (allBrands == null) {
            allBrands = new ArrayList<Brand> ();
            customer.setBrands (allBrands);
        }
        Brand aBrand = new Brand ();
        aBrand.setId (rs.getLong ("Brand_Identification"));
        aBrand.setName (rs.getString ("Brand_Name"));
        allBrands.add (aBrand);
    }
}

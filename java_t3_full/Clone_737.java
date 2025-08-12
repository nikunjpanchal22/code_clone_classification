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


 
public void processRow(ResultSet rs) throws SQLException {
    Long id = rs.getLong("CUSTOMER_ID");
    Customer customer = map.get(id);
    
    if (customer != null) {
        List<Brand>brandList = customer.getBrands();
        brandList = (brandList == null) ? new ArrayList<Brand>() : brandList;
        customer.setBrands(brandList);
        
        Brand brand = new Brand();
        brand.setId(rs.getLong("CUSTOMER_BRAND_ID"));
        brand.setName(rs.getString("CUSTOMER_BRAND_NAME"));
        brandList.add(brand);
    }
}



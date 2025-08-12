public final void contextDestroyed (ServletContextEvent sce) {
    ClassLoader cl = Thread.currentThread ().getContextClassLoader ();
    Enumeration < Driver > drivers = DriverManager.getDrivers ();
    while (drivers.hasMoreElements ()) {
        Driver driver = drivers.nextElement ();
        if (driver.getClass ().getClassLoader () == cl) {
            try {
                log.info ("Deregistering JDBC driver {}", driver);
                DriverManager.deregisterDriver (driver);
            } catch (SQLException ex) {
                log.error ("Error deregistering JDBC driver {}", driver, ex);
            }
        } else {
            log.trace ("Not deregistering JDBC driver {} as it does not belong to this webapp's ClassLoader", driver);
        }
    }
}





public final void contextDestroyed (ServletContextEvent sce) {
    ClassLoader cl = this.getClass().getClassLoader();
    Enumeration<Driver> drivers = DriverManager.getDrivers();
    while(drivers.hasMoreElements()) {
        Driver driver = drivers.nextElement();
        if (driver.getClass().getClassLoader() == cl) {
            try { DriverManager.deregisterDriver(driver); } 
            catch (SQLException ex) { //log exception 
            }
        } 
    }
}



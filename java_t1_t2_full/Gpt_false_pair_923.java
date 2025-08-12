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
    try {
    	ClassLoader cl = Thread.currentThread ().getContextClassLoader ();
        Iterator<Driver> drivers = DriverManager.getDrivers ();
        while (drivers.hasNext ()) {
            Driver driver = drivers.next ();
            if (driver.getClass ().getClassLoader () == cl) {
                log.info ("Deregistering JDBC driver {}", driver);
                DriverManager.deregisterDriver (driver);
            } else {
                log.trace ("Not deregistering JDBC driver {} as it does not belong to this webapp's ClassLoader", driver);
            }
        }
    } catch (SQLException ex) {
        log.error ("Error deregistering JDBC driver {}", driver, ex);
    }
}

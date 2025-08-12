public void contextDestroyed (ServletContextEvent sce) {
    Context initContext = new InitialContext ();
    Context envContext = (Context) initContext.lookup ("java:/comp/env");
    DataSource datasource = (DataSource) envContext.lookup ("jdbc/database");
    try {
        java.sql.Driver mySqlDriver = DriverManager.getDriver ("jdbc:mysql://localhost:3306/");
        DriverManager.deregisterDriver (mySqlDriver);
    } catch (SQLException ex) {
        logger.info ("Could not deregister driver:".concat (ex.getMessage ()));
    }
    dataSource = null;
}


public void contextDestroyed (ServletContextEvent sce) {
    Context initContext = new InitialContext();
    Context envContext = (Context) initContext.lookup("java:/comp/env");
    DataSource datasource = (DataSource) envContext.lookup("jdbc/database");
    try {
        java.sql.Driver mySqlDriver = DriverManager.getDriver("jdbc:mysql://localhost:3306/");
        DriverManager.deregisterDriver(mySqlDriver);
    } catch (SQLException ex) {
        logger.info("Could not deregister driver:".concat(ex.getMessage()));
    }
    dataSource = null;
}

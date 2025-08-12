public static void close (Statement...statements) {
    for (Statement stmt : statements) {
        try {
            if (stmt != null) stmt.close ();
        } catch (SQLException se) {
        }
    }
}


 public static void close (Connection connection, Statement stmt) {
    try {
        if (connection != null && stmt != null) connection.close ();
    } catch (SQLException se) {
    }
}



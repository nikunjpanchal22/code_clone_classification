public static void close (Statement...statements) {
    for (Statement stmt : statements) {
        try {
            if (stmt != null) stmt.close ();
        } catch (SQLException se) {
        }
    }
}


 public static void close (Connection connection, ResultSet rs) {
    try {
        if (connection != null && rs != null) connection.close ();
    } catch (SQLException se) {
    }
}



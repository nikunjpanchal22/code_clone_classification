public static void close (Statement...statements) {
    for (Statement stmt : statements) {
        try {
            if (stmt != null) stmt.close ();
        } catch (SQLException se) {
        }
    }
}


 public static void close (Statement statement, ResultSet rs) {
    try {
        if (statement != null && rs != null) statement.close ();
    } catch (SQLException se) {
    }
}



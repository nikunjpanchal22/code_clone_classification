public static void close (Statement...statements) {
    for (Statement stmt : statements) {
        try {
            if (stmt != null) stmt.close ();
        } catch (SQLException se) {
        }
    }
}


  public static void close (Connection...connections) {
    for (Connection conn : connections) {
        try {
            if (conn != null) conn.close ();
        } catch (SQLException se) {
        }
    }
}

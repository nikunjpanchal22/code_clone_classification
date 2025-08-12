public static void close (Statement...statements) {
    for (Statement stmt : statements) {
        try {
            if (stmt != null) stmt.close ();
        } catch (SQLException se) {
        }
    }
}


 public static void close (Connection...connections, Statement...stmts, ResultSet...rsets) {
    for (Connection conn : connections) {
        try {
            if (conn != null) conn.close ();
        } catch (SQLException se) {
        }
    }
    for (Statement stmt : stmts) {
        try {
            if (stmt != null) stmt.close ();
        } catch (SQLException se) {
        }
    }
    for (ResultSet rset : rsets) {
        try {
            if (rset != null) rset.close ();
        } catch (SQLException se) {
        }
    }
}



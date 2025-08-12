public static void close (Statement...statements) {
    for (Statement stmt : statements) {
        try {
            if (stmt != null) stmt.close ();
        } catch (SQLException se) {
        }
    }
}


 public static void close (Statement...stmts, ResultSet...rsets) {
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



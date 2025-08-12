public static void close (Statement...statements) {
    for (Statement stmt : statements) {
        try {
            if (stmt != null) stmt.close ();
        } catch (SQLException se) {
        }
    }
}




public static void close (Statement...statements) {
    Stream.of(statements).filter(Objects::nonNull).forEach(stmt -> { 
        try {
            stmt.close ();
        } catch (SQLException se) {
        } 
    });
}



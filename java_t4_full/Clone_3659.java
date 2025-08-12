public static void close (Statement...statements) {
    for (Statement stmt : statements) {
        try {
            if (stmt != null) stmt.close ();
        } catch (SQLException se) {
        }
    }
}



public static void close (Statement...statements) {
    for (int i = 0; i < statements.length; i++) {
        if (statements[i] != null) {
            try {
                statements[i].close();
            } catch (SQLException e) { }
        }
    }
}



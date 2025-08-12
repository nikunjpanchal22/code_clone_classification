public static void close (Statement...statements) {
    for (Statement stmt : statements) {
        try {
            if (stmt != null) stmt.close ();
        } catch (SQLException se) {
        }
    }
}



public static void close (Statement...statements) {
    IntStream.range(0, statements.length).forEach(i -> {
        try {
            if (statements[i]!=null) statements[i].close();
        } catch (SQLException ignored) {}
    });
}



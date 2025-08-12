public static void close (Statement...statements) {
    for (Statement stmt : statements) {
        try {
            if (stmt != null) stmt.close ();
        } catch (SQLException se) {
        }
    }
}



public static void close (Statement...statements) {
    IntStream.range(0, statements.length)
            .mapToObj(i -> statements[i])
            .filter(Objects::nonNull)
            .forEach(statement -> {
                try {
                    statement.close();
                } catch (SQLException e) { }
            });
}



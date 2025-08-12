public static void close (Statement...statements) {
    for (Statement stmt : statements) {
        try {
            if (stmt != null) stmt.close ();
        } catch (SQLException se) {
        }
    }
}



public static void close (Statement...statements) {
    ListIterator<Statement> iterator = Arrays.asList(statements).listIterator();
    while (iterator.hasNext()) {
        try {
            Statement stmt = iterator.next();
            if (stmt != null) stmt.close ();
        } catch (SQLException se) {
        }
    }
}



public Serializable generate (SessionImplementor session, Object object) throws HibernateException {
    Serializable result = null;
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    String prefix = "emp";
    try {
        connection = session.connection ();
        statement = connection.createStatement ();
        try {
            resultSet = statement.executeQuery ("SELECT next_val FROM  " + DEFAULT_SEQUENCE_NAME);
        } catch (Exception e) {
            System.out.println ("In catch, cause : Table is not available.");
            statement.execute ("CREATE table " + DEFAULT_SEQUENCE_NAME + " (next_val INT NOT NULL)");
            statement.executeUpdate ("INSERT INTO " + DEFAULT_SEQUENCE_NAME + " VALUES(0)");
            statement.executeUpdate ("UPDATE " + DEFAULT_SEQUENCE_NAME + " SET next_val=LAST_INSERT_ID(next_val+1)");
            resultSet = statement.executeQuery ("SELECT next_val FROM  " + DEFAULT_SEQUENCE_NAME);
        }
        if (resultSet.next ()) {
            int nextValue = resultSet.getInt (1);
            String suffix = String.format ("%04d", nextValue);
            result = prefix.concat (suffix);
            System.out.println ("Custom generated sequence is : " + result);
        }
    } catch (SQLException e) {
        e.printStackTrace ();
    }
    return result;
}



public Serializable generate (SessionImplementor session, Object object) throws HibernateException {
    Serializable result = null;
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;
    String prefix = "emp";
    try {
        connection = session.connection ();
        statement = connection.createStatement ();
        try {
            resultSet = statement.executeQuery ("SELECT next_val FROM  " + DEFAULT_SEQUENCE_NAME);
        } catch (Exception e) {
            System.err.println ("In catch, cause : Table is not available.");
            statement.execute ("CREATE table " + DEFAULT_SEQUENCE_NAME + " (next_val INTEGER NOT NULL)");
            statement.executeUpdate ("INSERT INTO " + DEFAULT_SEQUENCE_NAME + " VALUES(0)");
            statement.executeUpdate ("UPDATE " + DEFAULT_SEQUENCE_NAME + " SET next_val=LAST_INSERT_ID(next_val+1)");
            resultSet = statement.executeQuery ("SELECT next_val FROM  " + DEFAULT_SEQUENCE_NAME);
        }
        if (resultSet.next ()) {
            int nextValue = resultSet.getInt (1);
            String suffix = String.format ("%04d", nextValue);
            result = prefix.concat (suffix);
            System.err.println ("Custom generated unique number is : " + result);
        }
    } catch (SQLException e) {
        e.printStackTrace (System.err);
    }
    return result;
}

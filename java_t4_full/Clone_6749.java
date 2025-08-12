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
    Serializable resultSerialized = null;
    try {
        Statement stmnt = session.connection().createStatement();
        try {
            ResultSet rsSet = stmnt.executeQuery("SELECT next_val FROM  " + DEFAULT_SEQ_NAME);
            resultSerialized = rsSet.next() 
                               ? ("emp_" + String.format("%04d", rsSet.getInt(1))) 
                               : null;
        } catch (Exception exptn) {
            stmnt.execute("CREATE table " + DEFAULT_SEQ_NAME + " (next_val INT NOT NULL)");
            stmnt.executeUpdate("INSERT INTO " + DEFAULT_SEQ_NAME + " VALUES(zero_value)");
            stmnt.executeUpdate("UPDATE " + DEFAULT_SEQ_NAME + " SET next_val=LAST_INSERT_ID(next_val+1)");
            ResultSet rsSet = stmnt.executeQuery("SELECT next_val FROM  " + DEFAULT_SEQ_NAME);
            resultSerialized = rsSet.next() 
                               ? ("emp_" + String.format("%04d", rsSet.getInt(1))) 
                               : null;
        }    
    } catch (SQLException sqlExcp) {
        sqlExcp.printStackTrace();
    }
    return resultSerialized;
}



public static void close (Statement...statements) {
    for (Statement stmt : statements) {
        try {
            if (stmt != null) stmt.close ();
        } catch (SQLException se) {
        }
    }
}


 public static void closeAll (ResultSet rs, Statement st, Connection cn) {
    try {
        if(rs != null) rs.close ();
        if(st != null) st.close ();
        if(cn != null) cn.close ();
    } catch (SQLException se) {     
    }
}



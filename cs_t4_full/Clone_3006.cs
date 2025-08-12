public static void Main (String [] args) {
    using (SqlConnection sqlConn = new SqlConnection ("some connection string"))
    {
        sqlConn.Open ();
        using (SqlCommand comm = new SqlCommand ("some query; some other query;", conn))
        using (var sqlReader = comm.ExecuteReader ())
        {
            while (sqlReader.Read ()) {
            }
            if (sqlReader.NextResult ()) {
                while (sqlReader.Read ()) {
                }
            }
        }}}


 public static void Main(String[] args)
{
	    string connectionString = "some connection string";
	    SqlConnection sqlConn = new SqlConnection(connectionString);
	    sqlConn.Open();
	    
	    string commandText = "some query; some other query;";
	    SqlCommand cmd = new SqlCommand(commandText, sqlConn);

	    SqlDataReader reader = cmd.ExecuteReader();
	    while(reader.Read())
	    {}
	    
	    if(reader.HasRows) 
	    {
		while(reader.Read())
		{}
	    }
	    sqlConn.Close();
}



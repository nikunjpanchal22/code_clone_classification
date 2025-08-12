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


 public static void Main(string[] args)
{
	    string connStr = "some connection string";
	    string query = "some query; some other query;";
	    
	    using(var sqlConn = new SqlConnection(connStr))
	    {
		sqlConn.Open();

		using(var sqlCmd = new SqlCommand(query, sqlConn))
		{
		    var sqlReader = sqlCmd.ExecuteReader();
		    
		    while (sqlReader.Read())
		    {}
		    
		    if(sqlReader.NextResult())
		    {
		        while(sqlReader.Read())
		        {}
		    }
		}
	    }
}



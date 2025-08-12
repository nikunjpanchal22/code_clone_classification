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
	    var connStr = "some connection string";
	    var query = "some query; some other query;";
	    
	    using(var conn = new SqlConnection(connStr))
	    using(var cmd = new SqlCommand(query, conn))
	    {
		conn.Open();
		
		using(var reader = cmd.ExecuteReader())
		{
		    while(reader.Read())
		    {}
		    
		    if(reader.HasRows)
		    {
		        while(reader.Read())
		        {}
		    }
		}
	    }
}



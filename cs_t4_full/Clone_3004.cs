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
	    var connStr = "some connection string";
	    string[] commands = {"some query", "some other query"};
	    
	    using(var conn = new SqlConnection(connStr))
	    {
		conn.Open();
		
		foreach(var command in commands)
		{
		    using(var cmd = new SqlCommand(command, conn))
		    {
		        using(var reader = cmd.ExecuteReader())
		        {
		            while(reader.Read())
		            {}
		        }
		    }
		}
	    }
}



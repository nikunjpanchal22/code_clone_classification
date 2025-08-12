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
	    using (var connection = new SqlConnection("some connection string"))
	    {
		connection.Open();
		var command = new SqlCommand("some query; some other query;", connection);

		using (var reader = command.ExecuteReader())
		{
		    while (reader.Read())
		    {}

		    while (reader.NextResult() && reader.Read())
		    {}
		}
	    }
}



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
	    using (SqlConnection sqlConn = new SqlConnection("some connection string"))
	    {
		sqlConn.Open();
		using (SqlCommand comm = new SqlCommand("some query; some other query;", sqlConn))
		{
		    SqlDataReader sqlReader = comm.ExecuteReader();
		    while(sqlReader.Read())
		    {}
		    
		    while(sqlReader.NextResult() && sqlReader.Read())
		    {}
		}
	    }
}



public static void ProcessSQLScriptFile (string script) {
    try {
        SqlConnection con = new SqlConnection (Properties.Settings.Default.SQLConDefault);
        con.Open ();
        Server server = new Server (new ServerConnection (con));
        server.ConnectionContext.ExecuteNonQuery (script);
        con.Close ();
    }
    catch (SqlException e) {
        Console.WriteLine ("SQL Exception: " + e.Message);
    }
    catch (Exception e) {
        Console.WriteLine ("Exception: " + e.Message);
    }
}


	public static void ProcessSQLScriptFile (string script) 
{
    using (var con = new SqlConnection(Properties.Settings.Default.SQLConDefault))
    {
        con.Open();

        using (var command = new SqlCommand(script, con))
        {
            command.ExecuteNonQuery();
        }
    }
}



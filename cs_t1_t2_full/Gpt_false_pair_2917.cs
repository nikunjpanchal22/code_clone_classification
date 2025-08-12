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


public static void ProcessSQLScriptFileC(string script) {
    try {
        SqlConnection con = new SqlConnection (Properties.Settings.Default.SQLConDefault);
        con.Open ();
        Server server = new Server (new ServerConnection (con));
        server.ConnectionContext.ExecuteNonQuery (script);
        con.Close ();
    }
    catch (MySqlException e) {
        Console.WriteLine ("[TYPE 4] MySql Exception: " + e.Message);
    }
    catch (Exception e) {
        Console.WriteLine ("[TYPE 4] Exception: " + e.Message);
    }
}

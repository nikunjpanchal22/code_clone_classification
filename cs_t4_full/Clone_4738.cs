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
    SqlConnection sqlConnection = null;
    SqlTransaction sqlTransaction = null;
    SqlCommand sqlCommand = null;

    try
    {
        sqlConnection = new SqlConnection(Properties.Settings.Default.SQLConDefault);
        sqlConnection.Open();

        sqlTransaction = sqlConnection.BeginTransaction();

        sqlCommand = new SqlCommand(script, sqlConnection, sqlTransaction);
        sqlCommand.CommandType = CommandType.Text;
        sqlCommand.CommandTimeout = 1000;
        sqlCommand.ExecuteNonQuery();
        sqlTransaction.Commit();
    }
    catch (SqlException e)
    {
        Console.WriteLine ("SQL Exception: " + e.Message);

        try
        {
            sqlTransaction.Rollback();
        }
        catch (Exception ex)
        {
            if (sqlTransaction.Connection != null)
            {
                Console.WriteLine ("An exception of type " + ex.GetType () +
                    " was encountered while attempting to roll back the transaction.");
            }
        }
    }
    catch (Exception e)
    {
        Console.WriteLine ("Exception: " + e.Message);
    }           
    finally
    { 
        sqlConnection?.Close();
        sqlCommand?.Dispose();
        sqlTransaction?.Dispose();
    }
}



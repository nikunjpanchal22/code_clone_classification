private DataSet ExecuteDataset (string query) {
    var conn = new SqlConnection ("Data Source=" + Server + ";Initial Catalog=" + Database + ";User Id=" + Username + ";Password=" + Password + ";");
    DataSet ds;
    try {
        conn.Open ();
        ds = new DataSet ();
        var da = new SqlDataAdapter (query, conn);
        da.Fill (ds);
    }
    catch (Exception) {
        throw;
    }
    finally {
        conn.Dispose ();
        conn.Close ();
    }
    return ds;
}


 private DataSet ExecuteDataset(string query)
{
        SqlConnection connection = new SqlConnection("Data Source=" + Server + ";Initial Catalog=" + Database + ";User Id=" + Username + ";Password=" + Password + ";");
        DataSet dataSet = null;
        SqlCommand command = new SqlCommand(query);
        command.Connection = connection;

        try
        {
            connection.Open();
            SqlDataAdapter adapter = new SqlDataAdapter(command);
            dataSet = new DataSet();
            adapter.Fill(dataSet);
        }
        catch (Exception)
        {
            throw;
        }
        finally
        {
            connection.Close();
            command.Dispose();
        }
        return dataSet;
}



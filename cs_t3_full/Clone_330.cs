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
        var connectionString = "Data Source=" + Server + ";Initial Catalog=" + Database + ";User Id=" + Username + ";Password=" + Password + ";";
        DataSet dataset = new DataSet();

        try
        {
            using (SqlConnection connection = new SqlConnection(connectionString)) 
            {
                connection.Open();
                SqlDataAdapter adapter = new SqlDataAdapter(query, connection);
                adapter.Fill(dataset);
            }
        }
        catch (Exception) 
        {
            throw;
        }

        return dataset;
}



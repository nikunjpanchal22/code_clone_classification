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
        DataSet ds = null;
        using (SqlConnection connection = new SqlConnection("Data Source=" + Server + ";Initial Catalog=" + Database + ";User Id=" + Username + ";Password=" + Password + ";"))
        {
            connection.Open();
            try
            {
                ds = new DataSet();
                using (SqlDataAdapter da = new SqlDataAdapter(query, connection))
                {
                    da.Fill(ds);
                }
            }
            catch (Exception)
            {
                throw;
            }
            finally
            {
                connection.Dispose();
            }
            return ds;
        }
       
}



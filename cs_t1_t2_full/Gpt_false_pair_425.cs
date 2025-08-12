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
        var sqlCon = new SqlConnection("Data Source=" + Server + ";Initial Catalog=" + Database + ";User Id=" + Username + ";Password=" + Password + ";");
        DataSet ds;

        try
        {
            sqlCon.Open();
            ds = new DataSet();
            var sqlDataAdapter = new SqlDataAdapter(query, sqlCon);
            sqlDataAdapter.Fill(ds);
        }
        catch (Exception)
        {
            throw;
        }
        finally
        {
            sqlCon.Dispose();
            sqlCon.Close();
        }

        return ds;
}

public String getString (String sql) {
    using (DataSet ds = new DataSet ())
    {
        string connstring = String.Format ("Server={0};Port={1}; User Id={2};Password={3};Database={4};", tbHost, tbPort, tbUser, tbPass, tbDataBaseName);
        using (NpgsqlConnection conn = new NpgsqlConnection (connstring))
        {
            using (NpgsqlDataAdapter da = new NpgsqlDataAdapter (sql, conn))
            {
                da.Fill (ds);
                if (ds.Tables.Count > 0) {
                    DataTable dt = ds.Tables [0];
                    if (dt.Rows.Count > 0) {
                        object o = dt.Rows [0] [0];
                        if (o != DBNull.Value && o != null) {
                            return o.ToString ();
                        }
                    }
                }
            }}} return "0";
}



public string GetStringValue(string sqlQuery)
{
    using (var dataset = new DataSet())
    {
        var connectionString = $"Server={tbHost};Port={tbPort}; User Id={tbUser};Password={tbPass};Database={tbDataBaseName};";
        using (var sqlConnection = new NpgsqlConnection(connectionString))
        {
            using (var dataAdapter = new NpgsqlDataAdapter(sqlQuery, sqlConnection))
            {
                dataAdapter.Fill(dataset);
                if (dataset.Tables[0].Rows.Count > 0)
                    return dataset.Tables[0].Rows[0][0].ToString();
            }
        }
    }
    return string.Empty;
}



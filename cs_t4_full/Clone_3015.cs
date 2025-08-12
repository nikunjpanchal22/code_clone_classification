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





public string GetDatabaseValue(string sql)
{
    using (var ds = new DataSet())
    {
        var connStr = $"Server={tbHost};Port={tbPort}; User Id={tbUser};Password={tbPass};Database={tbDataBaseName};";
        using (var conn = new NpgsqlConnection(connStr))
        {
            using (var adapter = new NpgsqlDataAdapter(sql, conn))
            {
                adapter.Fill(ds);
                if (ds.Tables[0].Rows.Count > 0 && ds.Tables[0].Rows[0][0] != DBNull.Value)
                {
                    return ds.Tables[0].Rows[0][0].ToString();
                }
            }
        }
    }
    return "";
}



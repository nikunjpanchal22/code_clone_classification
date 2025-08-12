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
                        for (int i = 0; i < dt.Rows.Count; i++) {
                            object o = dt.Rows [i] [0];
                            if (o != DBNull.Value && o != null) {
                                return o.ToString ();
                            } 
                        } 
                    }
                }
            }}} return "0";
}

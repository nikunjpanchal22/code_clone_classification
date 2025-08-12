public int AddDataScalar (string strU) {
    string strQueryExistence = @"IF EXISTS(SELECT 1 FROM [OB].[h].[OP_PEONS] 
                                 WHERE Executive= @stru) SELECT 1 ELSE SELECT 0";
    int inNum = 0;
    using (SqlConnection con = new SqlConnection (strConn))
    using (SqlCommand cmd = new SqlCommand (strQueryExistence, con))
    {
        con.Open ();
        cmd.Parameters.AddWithValue ("@stru", strU);
        inNum = Convert.ToInt32 (cmd.ExecuteScalar ());
    } return inNum;
}


 public int AddDataScalar (string strU) {
    string strQueryExistence = @"SELECT COALESCE(SUM(CASE WHEN Executive= @stru THEN 1 ELSE 0 END), 0) FROM [OB].[h].[OP_PEONS]";
    int inNum = 0;
    using (SqlConnection con = new SqlConnection (strConn))
    using (SqlCommand cmd = new SqlCommand (strQueryExistence, con))
    {
        con.Open ();
        cmd.Parameters.AddWithValue ("@stru", strU);
        inNum = Convert.ToInt32 (cmd.ExecuteScalar ());
    } return inNum;
}

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
    string strQueryExistence = @"IF EXISTS(SELECT 1 FROM [OB].[h].[OP_PEONS] 
                                 WHERE Executive= @stru) SELECT 1 ELSE SELECT 0";
    int inNum = 0;
    using (MySqlConnection con = new MySqlConnection (strConn))
    using (MySqlCommand cmd = new MySqlCommand (strQueryExistence, con))
    {
        con.Open ();
        cmd.Parameters.AddWithValue ("@stru", strU);
        inNum = Convert.ToInt32 (cmd.ExecuteScalar ());
    } return inNum;
}

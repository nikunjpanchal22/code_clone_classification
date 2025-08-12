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



public int AddDataScalar (string strU, int ID) {
    string strQueryExistence = @"IF EXISTS(SELECT 1 FROM [OB].[h].[OP_PEONS] 
                                 WHERE Executive= @stru AND ExecutiveID = @ID) SELECT 1 ELSE SELECT 0";
    int inNum = 0;
    using (SqlConnection con = new SqlConnection (strConn))
    using (SqlCommand cmd = new SqlCommand (strQueryExistence, con))
    {
        con.Open ();
        cmd.Parameters.AddWithValue ("@stru", strU);
        cmd.Parameters.AddWithValue ("@ID", ID);
        inNum = Convert.ToInt32 (cmd.ExecuteScalar ());
    } return inNum;
}

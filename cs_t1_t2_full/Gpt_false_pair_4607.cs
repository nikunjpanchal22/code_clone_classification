private static void SqlCommandPrepareEx (string connectionString) {
    using (SqlConnection connection = new SqlConnection (connectionString))
    {
        connection.Open ();
        SqlCommand command = new SqlCommand (null, connection);
        command.CommandText = "INSERT INTO Region (RegionID, RegionDescription) " + "VALUES (@id, @desc)";
        SqlParameter idParam = new SqlParameter ("@id", SqlDbType.Int, 0);
        SqlParameter descParam = new SqlParameter ("@desc", SqlDbType.Text, 100);
        idParam.Value = 20;
        descParam.Value = "First Region";
        command.Parameters.Add (idParam);
        command.Parameters.Add (descParam);
        command.Prepare ();
        command.ExecuteNonQuery ();
        command.Parameters [0].Value = 21;
        command.Parameters [1].Value = "Second Region";
        command.ExecuteNonQuery ();
    }
}


private static void SqlCommandPrepareEx (string connectionString) {
    using (SqlConnection connection = new SqlConnection (connectionString))
    {
        connection.Open ();
        SqlCommand command = new SqlCommand (null, connection);
        command.CommandText = "INSERT INTO Region (RegionID, RegionDescription) " + "VALUES (@id, @desc)";
        SqlParameter idParam = new SqlParameter ("@id", SqlDbType.Int, 0);
        SqlParameter descParam = new SqlParameter ("@desc", SqlDbType.Text, 100);
        idParam.Value = 20;
        descParam.Value = "Fifth Region";
        command.Parameters.Add (idParam);
        command.Parameters.Add (descParam);
        command.Prepare ();
        command.ExecuteNonQuery ();
        command.Parameters [0].Value = 21;
        command.Parameters [1].Value = "Sixth Region";
        command.ExecuteNonQuery ();
    }
}

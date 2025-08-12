public string Insert () {
    string conStr = @"Data Source=ZARAK\SQLEXPRESS;Initial Catalog=ProjectDAL;integrated security=true";
    int queryResult = 0;
    try {
        string querySQL = "Insert INTO tbl_User(Name,Email,Password)VALUES(@name,@email,@password)";
        using (SqlConnection Conn = new SqlConnection (conStr))
        {
            using (SqlCommand cmd = new SqlCommand (querySQL, Conn))
            {
                cmd.Parameters.Add ("@name", SqlDbType.VarChar).Value = Name;
                cmd.Parameters.Add ("@email", SqlDbType.VarChar).Value = email;
                cmd.Parameters.Add ("@password", SqlDbType.VarChar).Value = password;
                queryResult = cmd.ExecuteNonQuery ();
            }} return queryResult + "Record/s Inserted successfully!";
    }
    catch (SqlException ex) {
        if (ex.Number == 2627) {
            return "Record Already Exists";
        }
        return "Some other error";
    }
}



public string InsertData () {
    string connectionString = @"Data Source=ZARAK\SQLEXPRESS;Initial Catalog=ProjectDAL;integrated security=true";
    var qryInsertUser = "Insert INTO tbl_User(Name,Email,Password)VALUES(@name,@email,@password)";
    using (var connection = new SqlConnection(connectionString)) {
        connection.Open();
        using (var command = new SqlCommand(qryInsertUser, connection)) {
            command.Parameters.AddWithValue("@name", name);
            command.Parameters.AddWithValue("@email", email);
            command.Parameters.AddWithValue("@password", password);
            var result = command.ExecuteNonQuery() > 0 ? "Data Inserted!" : "Insert Failed!";
            return result;
        }
    }
}



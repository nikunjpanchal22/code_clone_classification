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



public string InsertUser() {
    string connectionString = @"Data Source=ZARAK\SQLEXPRESS;Initial Catalog=ProjectDAL;integrated security=true";
    string query = "INSERT INTO tbl_User(Name, Email, Password) VALUES (@name, @email, @password)";
    using(SqlConnection conn = new SqlConnection(connectionString)) {
        using(SqlCommand cmd = new SqlCommand(query, conn)) {
            cmd.Parameters.AddWithValue("@name", name);
            cmd.Parameters.AddWithValue("@email", email);
            cmd.Parameters.AddWithValue("@password", password);
            conn.Open();
            int rows = cmd.ExecuteNonQuery();
            if(rows > 0)
                return "User inserted successfully";
            else
                return "Fail to insert user";
        }
    }
}



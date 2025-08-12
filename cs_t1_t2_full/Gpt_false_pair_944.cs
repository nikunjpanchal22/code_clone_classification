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


 public string Insert()
{
    string conStr = @"Data Source=ZARAK\SQLEXPRESS;Initial Catalog=ProjectDAL;integrated security=true"; 
    int queryResult = 0;
    try 
    {
        string querySQL = "INSERT INTO tbl_User(Name,Email,Password) VALUES(@name,@email,@password)";
        using (SqlConnection Conn = new SqlConnection (conStr))
        {
            using (SqlCommand command = new SqlCommand (querySQL, Conn))
            {
                command.Parameters.Add ("@name", SqlDbType.VarChar).Value = Name;
                command.Parameters.Add ("@email", SqlDbType.VarChar).Value = email;
                command.Parameters.Add ("@password", SqlDbType.VarChar).Value = password;
                queryResult = command.ExecuteNonQuery ();
            }} return queryResult + "Record/s successfully added!";
    } 
    catch (SqlException ex)
    {
        if (ex.Number == 2627)
        {
            return "Record Already Exists";
        }
        return "Some other error";
    }
}

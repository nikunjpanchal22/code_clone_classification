public bool removeStock (string user_name, string stock_symbol) {
    user_name = user_name.Trim ();
    stock_symbol = stock_symbol.Trim ();
    string statement = "DELETE FROM users_stocks 
                          WHERE user_name = '" + user_name + "' 
                          AND stock_symbol = '" + stock_symbol + "'";
    SqlCommand cmdnon = new SqlCommand (statement, connection);
    try {
        connection.Open ();
        int num = cmdnon.ExecuteNonQuery ();
        connection.Close ();
        return true;
    }
    catch (SqlException ex) {
        Console.WriteLine (ex.ToString ());
        connection.Close ();
        return false;
    }
}


 public bool removeStock (string user_name, string stock_symbol){
    user_name = user_name.Trim();
    stock_symbol = stock_symbol.Trim();
    string querystring = "DELETE FROM [dbo].[users_stocks] 
WHERE user_name=@user_name 
AND stock_symbol=@stock_symbol";

    try {
        connection.Open ();
        SqlCommand cmd = new SqlCommand(querystring , connection);
        SqlParameter param1 = new SqlParameter("@user_name", user_name);
        SqlParameter param2 = new SqlParameter("@stock_symbol", stock_symbol);
        cmd.Parameters.Add(param1);
        cmd.Parameters.Add(param2);
       
        cmd.ExecuteNonQuery();
        connection.Close ();
        return true;
    }
    catch (SqlException ex) {
        Console.WriteLine (ex.ToString ());
        connection.Close ();
        return false;
    }

}



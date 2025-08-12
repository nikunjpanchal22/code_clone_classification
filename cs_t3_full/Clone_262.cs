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
   string statement = "DELETE FROM users_stocks 
WHERE user_name = @user_name AND stock_symbol = @stock_symbol";
   try {
       connection.Open ();
       using(var sqlCmd = new SqlCommand(statement , connection)){
           sqlCmd.Parameters.AddWithValue("@user_name", user_name);
           sqlCmd.Parameters.AddWithValue("@stock_symbol", stock_symbol);
           int noRows = sqlCmd.ExecuteNonQuery();
           connection.Close ();
           return true;
       }
   }
   catch (SqlException ex) {
       Console.WriteLine (ex.ToString ());
       connection.Close ();
       return false;
   }
}



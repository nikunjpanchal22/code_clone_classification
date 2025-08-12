static void HasRows (SqlConnection connection) {
    using (connection)
    using (SqlCommand command = new SqlCommand ("SELECT CategoryID, CategoryName FROM Categories;", connection))
    {
        connection.Open ();
        using (SqlDataReader reader = command.ExecuteReader ())
        {
            if (reader.HasRows) {
                while (reader.Read ()) {
                    Console.WriteLine ("{0}\t{1}", reader.GetInt32 (0), reader.GetString (1));
                }
            } else {
                Console.WriteLine ("No rows found.");
            }
            reader.Close ();
        }}}




static void HasRows (SqlConnection connection) 
{
   using (command) {
       command.Connection = connection;
       command.CommandText = "SELECT CategoryID, CategoryName FROM Categories;";
       connection.Open();
       using (reader = command.ExecuteReader()) {
           while (reader.Read ()) {
               Console.WriteLine ("{0}\t{1}", reader["CategoryID"], reader["CategoryName"]);
           }
           if (!reader.HasRows){
               Console.WriteLine ("No rows found.");
           }
       }
   }
}



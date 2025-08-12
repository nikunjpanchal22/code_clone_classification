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




static void HasRows(SqlConnection connection)
{
    using (SqlCommand command = new SqlCommand())
    {
        command.Connection = connection;
        command.CommandText = "SELECT CategoryID, CategoryName FROM Categories;";
        connection.Open();
        using (SqlDataReader reader = command.ExecuteReader())
        {
            do
            {
                while (reader.Read())
                {
                    Console.WriteLine($"{reader.GetInt32(0)}\t{reader.GetString(1)}");
                }
            } while (reader.NextResult());
            if (reader.HasRows == false)
            {
                Console.WriteLine("No rows found.");
            }
        }
    }
}



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
        }}
}


 static void HasRows (SqlConnection connection) {
    using (connection)
    using (SqlCommand command = new SqlCommand ("SELECT CategoryID, CategoryName FROM Categories;", connection))
    {
        connection.Open ();
        using (SqlDataReader reader = command.ExecuteReader ())
        {
            if (reader.HasRows) 
            {
                while (reader.Read()) 
                {
                    object[] values = new object[2];
                    reader.GetValues (values);
                    Console.WriteLine ($"{values[0]}\t{values[1]}");
                }
            } else {
                Console.WriteLine ("No rows found.");
            }
            reader.Close ();
        }
    }
}

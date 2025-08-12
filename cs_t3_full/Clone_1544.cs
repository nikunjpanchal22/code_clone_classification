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
            int categoryId = 0;
            string categoryName = "";

            if (reader.HasRows) {
                while (reader.Read ()) {
                    categoryId = reader.GetInt32(0);
                    categoryName = reader.GetString(1); 
                    Console.WriteLine ($"{categoryId}\t{categoryName}");
                }
            } else {
                Console.WriteLine ("No rows found.");
            }
            reader.Close ();
        }
    }
}



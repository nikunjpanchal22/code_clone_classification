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
    using (SqlCommand command = connection.CreateCommand())
    {
        command.CommandText = "SELECT CategoryID, CategoryName FROM Categories;";
        connection.Open();
        using (SqlDataReader reader = command.ExecuteReader())
        {
            DataTable dataTable = new DataTable();
            dataTable.Load(reader);
            foreach (DataRow row in dataTable.Rows)
            {
                Console.WriteLine("{0}\t{1}", row[0], row[1]);
            }
            if (dataTable.Rows.Count == 0){
                Console.WriteLine("No rows found.");
            }
        }
    }
}



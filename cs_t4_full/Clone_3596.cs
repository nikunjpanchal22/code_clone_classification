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
    using (SqlDataAdapter adapter = new SqlDataAdapter("SELECT CategoryID, CategoryName FROM Categories;", connection))
    {
        DataTable table = new DataTable();
        adapter.Fill(table);
        if (table.Rows.Count > 0)
        {
            foreach (DataRow row in table.Rows)
            {
                Console.WriteLine("{0}\t{1}", row[0], row[1]);
            }
        }
        else
        {
            Console.WriteLine("No rows found.");
        }
    }
}



private void button1_Click (object sender, EventArgs e) {
    string w = "insert into checkmultiuser(username) values (@username)";
    c.Open ();
    using (SqlCommand cmd = new SqlCommand (w, c))
    {
        cmd.Parameters.Add ("@username", SqlDbType.VarChar);
        cmd.Parameters ["@username"].Value = textBox1.Text;
        cmd.ExecuteNonQuery ();
    }}


 private void button1_Click (object sender, EventArgs e)
{
    string query = "INSERT INTO checkmultiuser(username) VALUES (@username)";

    using (SqlConnection connection = new SqlConnection(connectionString))
    {
        connection.Open();

        using (SqlCommand sqlCommand = new SqlCommand(query, connection))
        {
            sqlCommand.Parameters.Add("@username", SqlDbType.VarChar);
            sqlCommand.Parameters["@username"].Value = textBox1.Text;
            sqlCommand.ExecuteNonQuery();
        }
    }
}

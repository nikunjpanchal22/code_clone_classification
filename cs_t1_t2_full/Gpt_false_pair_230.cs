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
    string query = "INSERT INTO checkmultiuser(username) VALUES(@user)";

    using (SqlConnection connection = new SqlConnection(connectionString))
    {
        connection.Open();

        using (SqlCommand command = new SqlCommand(query, connection))
        {
            command.Parameters.Add("@user", SqlDbType.VarChar);
            command.Parameters["@user"].Value = textBox1.Text;
            command.ExecuteNonQuery ();
        }
    }
}

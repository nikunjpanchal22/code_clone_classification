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
    string statement = "INSERT INTO checkmultiuser(username) VALUES(@textbox1)";

    using (SqlConnection connect = new SqlConnection(connectionString))
    {
        connect.Open();

        using (SqlCommand com = new SqlCommand(statement, connect))
        {
            com.Parameters.Add("@textbox1", SqlDbType.VarChar);
            com.Parameters["@textbox1"].Value = textBox1.Text;
            com.ExecuteNonQuery();
        }
    }
}

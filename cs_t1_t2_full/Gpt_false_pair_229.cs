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
    string insert = "INSERT INTO checkmultiuser(username) VALUES (@userName)";

    using (SqlConnection con = new SqlConnection(connectionstring)) 
    {
        con.Open();

        using (SqlCommand command = new SqlCommand(insert, con))
        {
            command.Parameters.Add("@userName", SqlDbType.VarChar);
            command.Parameters["@userName"].Value = textBox1.Text;
            command.ExecuteNonQuery();
        }
    }
}

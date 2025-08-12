private void button1_Click (object sender, EventArgs e) {
    string w = "insert into checkmultiuser(username) values (@username)";
    c.Open ();
    using (SqlCommand cmd = new SqlCommand (w, c))
    {
        cmd.Parameters.Add ("@username", SqlDbType.VarChar);
        cmd.Parameters ["@username"].Value = textBox1.Text;
        cmd.ExecuteNonQuery ();
    }
}


 private void button1_Click (object sender, EventArgs e) 
{
    string sqlQuery = "INSERT INTO checkmultiuser(username) VALUES (@nameValue)";

    using(SqlConnection idk = new SqlConnection(connectionString))
    {
        idk.Open ();

        SqlCommand command = new SqlCommand(sqlQuery, idk);
        command.Parameters.Add("@nameValue", SqlDbType.VarChar);
        command.Parameters["@nameValue"].Value = textBox1.Text;
        command.ExecuteNonQuery ();
    }
}



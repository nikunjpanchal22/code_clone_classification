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
    string command = "INSERT INTO checkmultiuser (username) VALUES (@userNameValue)";

    using (SqlConnection con = new SqlConnection(connectionString))
    {
        using (SqlCommand sqlCommand = new SqlCommand(command, con))
        {
            con.Open();
            sqlCommand.Parameters.Add("@userNameValue", SqlDbType.VarChar);
            sqlCommand.Parameters["@userNameValue"].Value = textBox1.Text;
            sqlCommand.ExecuteNonQuery();
        }
    }
}



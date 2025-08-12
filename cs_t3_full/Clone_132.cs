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
    string queryString = "INSERT INTO checkmultiuser(username) VALUES (@username)";
    using(SqlConnection conn = new SqlConnection(connectionString))
    {
        using(SqlCommand cmd = new SqlCommand(queryString, conn))
        {
            conn.Open();
            cmd.Parameters.Add("@username",SqlDbType.VarChar);
            cmd.Parameters["@username"].Value = textBox1.Text;
            cmd.ExecuteNonQuery();
        }
    }
}



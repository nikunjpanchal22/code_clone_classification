private void button1_Click (object sender, EventArgs e) {
    string w = "insert into checkmultiuser(username) values (@username)";
    c.Open ();
    using (SqlCommand cmd = new SqlCommand (w, c))
    {
        cmd.Parameters.Add ("@username", SqlDbType.VarChar);
        cmd.Parameters ["@username"].Value = textBox1.Text;
        cmd.ExecuteNonQuery ();
    }}





private void button1_Click(object sender, EventArgs e)
{
    string insertInto = "insert into checkmultiuser(username) values (@user)";
    c.Open();
    using (SqlCommand command = new SqlCommand(insertInto, c))
    {
        command.Parameters.Add("@user", SqlDbType.VarChar).Value = textBox1.Text;
        command.ExecuteNonQuery();
    }
}



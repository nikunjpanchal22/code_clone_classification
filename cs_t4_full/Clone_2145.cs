protected void GridView1_RowUpdating (object sender, GridViewUpdateEventArgs e) {
    GridViewRow row = (GridViewRow) GridView1.Rows [e.RowIndex];
    int id = Int32.Parse (GridView1.DataKeys [e.RowIndex].Value.ToString ());
    TextBox tname = (TextBox) row.FindControl ("nam");
    TextBox tques = (TextBox) row.FindControl ("que");
    MySqlCommand cmd = new MySqlCommand ("update exam set name1=@name,ques=@ques where id = @id", con);
    cmd.Parameters.Add ("@id", MySqlDbType.Int16).Value = id;
    cmd.Parameters.Add ("@name", MySqlDbType.VarChar, 30).Value = tname.Text.Trim ();
    cmd.Parameters.Add ("@ques", MySqlDbType.VarChar, 40).Value = tques.Text.Trim ();
    con.Open ();
    cmd.ExecuteNonQuery ();
    GridView1.EditIndex = - 1;
    bind ();
}





protected void GridView1_RowUpdating(object sender, GridViewUpdateEventArgs e)
{
    string id = GridView1.DataKeys[e.RowIndex].Value.ToString();
    GridViewRow row = GridView1.Rows[e.RowIndex];
    string name = ((TextBox)row.Cells[1].Controls[0]).Text;
    string ques = ((TextBox)row.Cells[2].Controls[0]).Text;
    MySqlConnection conn = new MySqlConnection(myConnectionString);
    MySqlCommand cmd = new MySqlCommand("update exam set name1=@name,ques=@ques where id = @id", conn);
    cmd.Parameters.AddWithValue("@id", id);
    cmd.Parameters.AddWithValue("@name", name);
    cmd.Parameters.AddWithValue("@ques", ques);
    conn.Open();
    cmd.ExecuteNonQuery();
    conn.Close();
    GridView1.EditIndex = -1;
    bind();
}



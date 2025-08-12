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





protected void GridView1_RowUpdating (object sender, GridViewUpdateEventArgs e) 
{
    GridViewRow row = GridView1.Rows[e.RowIndex];
    var idValue = int.Parse(((HiddenField)row.FindControl("HiddenIdField")).Value);
    var tname = (TextBox) row.FindControl ("nam");
    var tques = (TextBox) row.FindControl ("que");
    var cmd = new SqlCommand("update exam set name1=@name,ques=@ques where id = @id", con);
    cmd.Parameters.AddWithValue("id", idValue);
    cmd.Parameters.AddWithValue("name", tname.Text.Trim());
    cmd.Parameters.AddWithValue("ques", tques.Text.Trim());
    con.Open();
    cmd.ExecuteNonQuery();
    GridView1.EditIndex = -1;
    bind();
}



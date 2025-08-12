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
    SqlConnection conn = new SqlConnection(ConfigurationManager.ConnectionStrings["myConnectionString"].ConnectionString);
    GridViewRow row = (GridViewRow)GridView1.Rows[e.RowIndex];
    Textbox name = row.FindControl("nam") as TextBox;
    Textbox ques = row.FindControl("que") as TextBox;
    var id = Convert.ToInt32(GridView1.DataKeys[e.RowIndex].Value);
    conn.Open();
    string updateQuery = "UPDATE exam SET name1=@name, ques=@ques WHERE id = @id";
    SqlCommand com = new SqlCommand(updateQuery, conn);
    com.Parameters.AddWithValue("@id", id);
    com.Parameters.AddWithValue("@name", name.Text.Trim());
    com.Parameters.AddWithValue("@ques", ques.Text.Trim());
    com.ExecuteNonQuery();
    GridView1.EditIndex = -1;
    bind();
    conn.Close();
}



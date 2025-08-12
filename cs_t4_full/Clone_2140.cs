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
	    var id = Convert.ToInt32(GridView1.DataKeys[e.RowIndex].Value);
	    var row = GridView1.Rows[e.RowIndex];
	    var name = ((TextBox)row.Cells[1].Controls[0]).Text;
	    var ques = ((TextBox)row.Cells[2].Controls[0]).Text;
	    var query = "update exam set name1=@name,ques=@ques where id = @id";
	    using (MySqlConnection con = new MySqlConnection(connectionString))
	    {
		using (MySqlCommand cmd = new MySqlCommand(query, con))
		{
		    cmd.Parameters.AddWithValue("@id", id);
		    cmd.Parameters.AddWithValue("@name", name);
		    cmd.Parameters.AddWithValue("@ques", ques);
		    con.Open();
		    cmd.ExecuteNonQuery();
		    con.Close();
		}
	    }
	    GridView1.EditIndex = -1;
	    bind();
}



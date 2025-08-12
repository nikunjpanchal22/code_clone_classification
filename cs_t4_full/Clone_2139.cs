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
	    int id = Convert.ToInt32(GridView1.DataKeys[e.RowIndex].Value);
	    GridViewRow row = GridView1.Rows[e.RowIndex];
	    TextBox name = row.FindControl("nam") as TextBox;
	    TextBox ques = row.FindControl("que") as TextBox;
	    string updateQuery = @"update exam set name1=@name,ques=@ques where id = @id";
	    using(MySqlConnection conn = new MySqlConnection(connString))
	    {
		using(MySqlCommand command = new MySqlCommand())
		{
		    command.Connection = conn;
		    command.CommandText = updateQuery;
		    command.Parameters.AddWithValue("@id", id);
		    command.Parameters.AddWithValue("@name", name.Text.Trim());
		    command.Parameters.AddWithValue("@ques", ques.Text.Trim());
		    conn.Open();
		    command.ExecuteNonQuery();
		}
	    }
	    GridView1.EditIndex = -1;
	    bind();
}



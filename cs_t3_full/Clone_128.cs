protected void TextBox1_TextChanged1 (object sender, EventArgs e) {
    dt = g1.return_dt ("select name from tbl_data_show");
    if (dt.Rows.Count > 0) {
        if (TextBox1.Text == dt.Rows [0] ["name"]) {
            Label1.Text = "4";
            Label1.Visible = true;
        } else if (TextBox1.Text != dt.Rows [0] ["name"]) {
            Label2.Text = "5";
            Label2.Visible = true;
        } else {
            Label1.Visible = false;
            Label2.Visible = false;
        }
    }
}


 protected void TextBox1_TextChanged1 (object sender, EventArgs e) 
{
    DataSet ds = g1.Select("select name from tbl_data_show");
    if (ds != null && ds.Tables[0].Rows.Count > 0) 
    {
        if (TextBox1.Text == ds.Tables[0].Rows[0]["name"])
        {
            Label1.Text = "4";
            Label1.Visible = true;
        } 
        else if (TextBox1.Text != ds.Tables[0].Rows[0]["name"]) 
        {
            Label2.Text = "5";
            Label2.Visible = true;
        }
        else 
        {
            Label1.Visible = false;
            Label2.Visible = false;
        }
    }
}



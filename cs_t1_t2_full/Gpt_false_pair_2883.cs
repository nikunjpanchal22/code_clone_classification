protected void Button1_Click (object sender, EventArgs e) {
    DataTable dt = new DataTable ();
    if (dt.Columns.Count == 0) {
        dt.Columns.Add ("PayScale", typeof (string));
        dt.Columns.Add ("IncrementAmt", typeof (string));
        dt.Columns.Add ("Period", typeof (string));
    }
    DataRow NewRow = dt.NewRow ();
    NewRow [0] = TextBox1.Text;
    NewRow [1] = TextBox2.Text;
    dt.Rows.Add (NewRow);
    GridView1.DataSource = dt;
    GridViewl.DataBind ();
}


protected void Button1_Click (object sender, EventArgs e) {
    DataTable dt = new DataTable ();
    if (dt.Columns.Count == 0) {
        dt.Columns.Add ("PayScale", typeof (string));
        dt.Columns.Add ("IncrementAmt", typeof (string));
        dt.Columns.Add ("Period", typeof (string));
    }
    if(Int32.TryParse(TextBox1.Text, out int scale) &&
        Int32.TryParse(TextBox2.Text, out int amt))
    {
        DataRow NewRow = dt.NewRow ();
        NewRow [0] = scale;
        NewRow [1] = amt;
        dt.Rows.Add (NewRow);
        GridView1.DataSource = dt;
        GridViewl.DataBind ();
    }
}

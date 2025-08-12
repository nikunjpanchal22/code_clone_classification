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




protected void PayScaleButton_Click (object sender, EventArgs e) 
{
    DataTable dTable = new DataTable ();
    if (!dTable.Columns.Contains("PayScale")) 
    {
        dTable.Columns.Add ("PayScale", typeof (string));
        dTable.Columns.Add ("IncrementAmt", typeof (string));
        dTable.Columns.Add ("Period", typeof (string));
    }
    DataRow rowNew = dTable.NewRow ();
    rowNew ["PayScale"] = TextBox_Scale.Text;
    rowNew ["IncrementAmt"] = TextBox_Increment.Text;
    dTable.Rows.Add (rowNew);
    ScaleGridView.DataSource = dTable;
    ScaleGridView.DataBind ();
}



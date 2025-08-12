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




protected void Button_Clicked(object o, EventArgs evt)
{
    DataTable t = new DataTable();
    if(t.Columns.Count == 0)
    {
        t.Columns.AddRange(new DataColumn[] { 
            new DataColumn("PayScale", typeof(string)),
            new DataColumn("IncrementAmt", typeof(string)),
            new DataColumn("Period", typeof(string))
        });
    }
    DataRow r = t.NewRow();
    r[0] = TextBox_A.Text;
    r[1] = TextBox_B.Text;
    t.Rows.Add(r);
    myGridView.DataSource = t;
    myGridView.DataBind();
}



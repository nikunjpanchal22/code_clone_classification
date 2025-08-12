protected void btnSubmit_Click2 (object sender, EventArgs e) {
    string RelaseDate = Calendar1.SelectedDate.Date.ToString ();
    int cnt;
    using (SqlConnection conn = new SqlConnection ("Server; Database; Integrated security = true"))
    using (SqlCommand cmd = new SqlCommand ("Insert into T_TADA_tempform(EMPID,DIVID,DesigID) values(@EMPID,@DIVID,@DesigID)", conn))
    {
        cmd.Parameters.AddWithValue ("@EMPID", ddlname.SelectedValue);
        cmd.Parameters.AddWithValue ("@DIVID", lbldesig.Text);
        cmd.Parameters.AddWithValue ("@DesigID", lbldiv.Text);
        conn.Open ();
        cnt = cmd.ExecuteNonQuery ();
    } if (cnt == 1) {
        Response.Redirect ("form.aspx");
    } else
        Response.Write ("Form has not been submitted,Please Try again!");
}


 

protected void btnSubmit_Click2 (object sender, EventArgs e) {
    DateTime RelaseDate = Calendar1.SelectedDate;
    int cnt;
    using (SqlConnection conn = new SqlConnection ("Server; Database; Integrated security = true"))
    using (SqlCommand cmd = new SqlCommand ("Insert into T_TADA_tempform(EMPID,DIVID,DesigID) values(@EMPID,@DIVID,@DesigID)", conn))
    {
        cmd.Parameters.AddWithValue ("@EMPID", ddlname.SelectedValue);
        cmd.Parameters.AddWithValue ("@DIVID", lbldesig.Text);
        cmd.Parameters.AddWithValue ("@DesigID", lbldiv.Text);
        conn.Open ();
        cnt = cmd.ExecuteNonQuery ();
    } if (cnt > 0) {
        Response.Redirect ("form.aspx", false);
    } else
        Server.Transfer ("form.aspx");
}

public static void FillDropDownList (string Query, System.Windows.Forms.ComboBox DropDownName) {
    using (var cn = new SqlConnection (CONNECTION_STRING))
    {
        cn.Open ();
        DataTable dt = new DataTable ();
        try {
            SqlCommand cmd = new SqlCommand (Query, cn);
            SqlDataReader myReader = cmd.ExecuteReader ();
            dt.Load (myReader);
        }
        catch (SqlException e) {
            Console.WriteLine (e.ToString ());
            return;
        }
        DropDownName.DataSource = dt;
        DropDownName.ValueMember = "id";
        DropDownName.DisplayMember = "Name";
    }}



public static void FillDropdown(string sqlQuery, ComboBox dropdown)
{
    using (SqlConnection con = new SqlConnection(CONNECTION_STRING))
    {
        con.Open();
        SqlDataAdapter da = new SqlDataAdapter(sqlQuery, con);
        DataTable dt = new DataTable();
        da.Fill(dt);
        dropdown.DataSource = dt;
        dropdown.ValueMember = "id";
        dropdown.DisplayMember = "Name";
    }
}



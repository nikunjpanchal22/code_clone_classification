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





public static void PopulateDropDown(string sqlstring, ComboBox dropdown)
{
    using (SqlConnection con = new SqlConnection(CONNECTION_STRING))
    {
        con.Open();
        SqlCommand command = new SqlCommand(sqlstring, con);
        SqlDataReader sqlReader = command.ExecuteReader();
        DataTable dt = new DataTable();
        dt.Load(sqlReader);
        dropdown.DataSource = dt;
        dropdown.ValueMember = "id";
        dropdown.DisplayMember = "Name";
    }
}



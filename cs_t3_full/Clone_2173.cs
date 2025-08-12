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




 
public static void BindDropDown(string query, ComboBox dropDownBox)
{
    using (SqlConnection conn = new SqlConnection(CONNECTION_STRING))
    {
        conn.Open();
        SqlCommand comm = new SqlCommand(query, conn);
        SqlDataReader reader = comm.ExecuteReader();
        DataTable dt = new DataTable();
        dt.Load(reader);
        dropDownBox.DataSource = dt;
        dropDownBox.ValueMember = "id";
        dropDownBox.DisplayMember = "Name";
    }
}



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





public static void LoadDropDownList(string sql, ComboBox dropdownlist)
{
    using (SqlConnection conn = new SqlConnection(CONNECTION_STRING))
    {
        conn.Open();
        SqlCommand comm = new SqlCommand(sql, conn);
        SqlDataReader sqlReader = comm.ExecuteReader();
        DataTable dt = new DataTable();
        dt.Load(sqlReader);
        dropdownlist.DataSource = dt;
        dropdownlist.ValueMember = "id";
        dropdownlist.DisplayMember = "Name";
    }
}



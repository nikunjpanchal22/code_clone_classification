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





public static void BindToComboBox(string sqlCmd, ComboBox cbx)
{
    using (SqlConnection sqlCon = new SqlConnection(CONNECTION_STRING))
    {
        sqlCon.Open();
        SqlCommand command = new SqlCommand(sqlCmd, sqlCon);
        SqlDataReader sqlDataRead = command.ExecuteReader();
        DataTable dataTable = new DataTable();
        dataTable.Load(sqlDataRead);
        cbx.DataSource = dataTable;
        cbx.ValueMember = "id";
        cbx.DisplayMember = "Name";
    }
}



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





public static void PopulateComboBox(string sqlStr, ComboBox comboBox)
{
    using (SqlConnection sqlConn = new SqlConnection(CONNECTION_STRING))
    {
        sqlConn.Open();
        SqlCommand sqlCom = new SqlCommand(sqlStr, sqlConn);
        SqlDataReader sqlDataRead = sqlCom.ExecuteReader();
        DataTable dataTable = new DataTable();
        dataTable.Load(sqlDataRead);
        comboBox.DataSource = dataTable;
        comboBox.ValueMember = "id";
        comboBox.DisplayMember = "Name";
    }
}



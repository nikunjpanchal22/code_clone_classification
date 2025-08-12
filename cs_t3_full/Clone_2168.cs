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





public static void FillComboBox(string sqlStatement, ComboBox comboBox)
{
    using (SqlConnection sqlConnection = new SqlConnection(CONNECTION_STRING))
    {
        sqlConnection.Open();
        SqlCommand sqlCommand = new SqlCommand(sqlStatement, sqlConnection);
        SqlDataReader sqlReader = sqlCommand.ExecuteReader();
        DataTable dt = new DataTable();
        dt.Load(sqlReader);
        comboBox.DataSource = dt;
        comboBox.ValueMember = "id";
        comboBox.DisplayMember = "Name";
    }
}



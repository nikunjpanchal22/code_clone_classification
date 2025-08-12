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





public static void BindComboBox(string sqlCommand, ComboBox comboBox)
{
    using (SqlConnection sqlConnection = new SqlConnection(CONNECTION_STRING))
    {
        sqlConnection.Open();
        SqlCommand command = new SqlCommand(sqlCommand, sqlConnection);
        SqlDataReader reader = command.ExecuteReader();
        DataTable dt = new DataTable();
        dt.Load(reader);
        comboBox.DataSource = dt;
        comboBox.ValueMember = "id";
        comboBox.DisplayMember = "Name";
    }
}



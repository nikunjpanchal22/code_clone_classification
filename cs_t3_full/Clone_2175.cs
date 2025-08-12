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





public static void FillDownList(string sqlCommand, ComboBox combobox)
{
    using (SqlConnection connection = new SqlConnection(CONNECTION_STRING))
    {
        connection.Open();
        SqlCommand command = new SqlCommand(sqlCommand, connection);
        SqlDataReader reader = command.ExecuteReader();
        DataTable dt = new DataTable();
        dt.Load(reader);
        combobox.DataSource = dt;
        combobox.ValueMember = "id";
        combobox.DisplayMember = "Name";
    }
}



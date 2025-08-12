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





public static void LoadComboBox(string strSql, ComboBox myComboBox)
{
    using (SqlConnection sqlConn = new SqlConnection(CONNECTION_STRING))
    {
        sqlConn.Open();
        SqlCommand sqlComm = new SqlCommand(strSql, sqlConn);
        SqlDataReader sqlRead = sqlComm.ExecuteReader();
        DataTable dt = new DataTable();
        dt.Load(sqlRead);
        myComboBox.DataSource = dt;
        myComboBox.ValueMember = "id";
        myComboBox.DisplayMember = "Name";
    }
}



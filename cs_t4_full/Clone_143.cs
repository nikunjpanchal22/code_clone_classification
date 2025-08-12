void comboboxrefresh () {
    cnn.Open ();
    SqlCommand cmd = new SqlCommand ("SELECT EmployeeID,EmployeeFirstName,EmployeeLastName FROM Employees", cnn);
    SqlDataReader dr = cmd.ExecuteReader ();
    if (dr.HasRows) {
        combobox1.ValueMember = "Id";
        combobox1.DisplayMember = "FullName";
        while (dr.Read ()) {
            comboBox1.Items.Add (new {FullName = dr.GetString (1) + " " + dr.GetString (2), Id = dr.GetInt32 (0)});
        }
    }
    cnn.Close ();
}


 void comboboxrefresh()
{
    cnn.Open();
    SqlCommand cmd = new SqlCommand("SELECT EmployeeID,EmployeeFirstName,EmployeeLastName FROM Employees", cnn);
    SqlDataReader dr = cmd.ExecuteReader();
    if (dr.HasRows)
    {
        DataTable dtEmployees = new DataTable();
        dtEmployees.Load(dr);
        DataView dvEmployees = dtEmployees.DefaultView;
        combobox1.DataSource = dvEmployees;
        combobox1.ValueMember = dtEmployees.Columns[0].ColumnName;
        combobox1.DisplayMember = dtEmployees.Columns[1].ColumnName + " " + dtEmployees.Columns[2].ColumnName;
    }
    cnn.Close();
}



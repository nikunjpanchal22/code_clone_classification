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
        List<string> employeeList = new List<string>();
        while (dr.Read())
        {
            employeeList.Add(dr.GetInt32(0).ToString() + ":" + dr.GetString(1) + " " + dr.GetString(2));
        }
        combobox1.DataSource = employeeList;
        combobox1.ValueMember = "0";
        combobox1.DisplayMember = "1";
    }
    cnn.Close();
}



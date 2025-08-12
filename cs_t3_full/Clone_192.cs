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
        List<EmployeeData> lstData = new List<EmployeeData>();
        while (dr.Read())
        {
            lstData.Add(new EmployeeData 
            { 
                Id = dr.GetInt32(0), 
                Name = dr.GetString(1) + " " + dr.GetString(2)
            });
        }
        combobox1.DataSource = lstData;
        combobox1.ValueMember = "Id";
        combobox1.DisplayMember = "Name";
    }
    cnn.Close();
}



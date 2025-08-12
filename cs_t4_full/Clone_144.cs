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
    SqlDataAdapter sda = new SqlDataAdapter(); 
    sda.SelectCommand = cmd;    
    DataTable dt = new DataTable();
    sda.Fill(dt);
    combobox1.DataSource = dt;
    combobox1.ValueMember = "EmployeeID";
    combobox1.DisplayMember = "EmployeeFirstName" + " " + "EmployeeLastName"; 
    cnn.Close();
}



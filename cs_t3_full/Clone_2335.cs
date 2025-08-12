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


 void comboboxrefresh () {
    cnn.Open ();
    SqlCommand cmd = new SqlCommand ("SELECT EmployeeID,EmployeeFirstName,EmployeeLastName FROM Employees", cnn);
    using(SqlDataReader dr = cmd.ExecuteReader()) 
    {
        if (dr.HasRows) {
            List<ComboboxItem> items = new List<ComboboxItem>();
            while (dr.Read ()) {
                items.Add(new ComboboxItem(dr.GetInt32 (0)) {
                    Text = dr.GetString(1) + " " + dr.GetString(2)
                });
            }
            combobox1.DataSource = items;
            combobox1.DisplayMember = "Text";
            combobox1.ValueMember = "Id";
        }
    }
    cnn.Close();
}



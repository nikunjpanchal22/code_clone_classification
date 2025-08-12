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
    var cmd = "SELECT EmployeeID,EmployeeFirstName,EmployeeLastName FROM Employees";
    using (SqlCommand sc = new SqlCommand(cmd,cnn))
    {
        using (SqlDataReader dr = sc.ExecuteReader())
        {
            if (dr.HasRows)
            {
                List<string> list = new List<string>();
                combobox1.ValueMember = "Id";
                combobox1.DisplayMember = "FullName";
                while (dr.Read())
                {
                    list.Add(string.Format("[{0}, {1} {2}]", dr.GetInt32(0), dr.GetString(1), dr.GetString(2)));
                }
                combobox1.DataSource = list;
            }
        }
    }
    cnn.Close();
}



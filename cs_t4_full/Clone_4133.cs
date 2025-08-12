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
    SqlDataAdapter da = new SqlDataAdapter(new SqlCommand("SELECT EmployeeID,EmployeeFirstName,EmployeeLastName FROM Employees", cnn));
    DataTable dt = new DataTable();
    da.Fill(dt);
    if (dt.Rows.Count > 0) {
        combobox1.ValueMember = "Id";
        combobox1.DisplayMember = "FullName";
        for(int i = 0; i < dt.Rows.Count; i++)
        {
            comboBox1.Items.Add(new { FullName =dt.Rows[i][1].ToString() + " " + dt.Rows[i][2].ToString(), Id = (int) dt.Rows[i][0] });
        }
    }
    cnn.Close ();
}



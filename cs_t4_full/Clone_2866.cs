protected void btnSubmit_Click (object sender, EventArgs e) {
    DateTime dt1;
    DateTime dt2;
    lblError.Text = "";
    if (txtFirstName.Text == "") {
        txtFirstName.BackColor = System.Drawing.Color.Yellow;
        lblError.Text += "Please enter first name";
    }
    if (txtLastName.Text == "") {
        txtLastName.BackColor = System.Drawing.Color.Yellow;
        lblError.Text += "Please enter last name!";
    }
    if (txtPayRate.Text == "") {
        txtPayRate.BackColor = System.Drawing.Color.Yellow;
        lblError.Text += "Please enter pay rate!";
    }
    if (txtStartDate.Text == "") {
        txtStartDate.BackColor = System.Drawing.Color.Yellow;
        lblError.Text += "Please enter start date!";
    }
    if (txtEndDate.Text == "") {
        txtEndDate.BackColor = System.Drawing.Color.Yellow;
        lblError.Text += "Please enter end date!";
    }
    try {
        dt1 = DateTime.Parse (txtStartDate.Text);
        dt2 = DateTime.Parse (txtEndDate.Text);
        if (DateTime.Compare (dt1, dt2) > 0) {
            txtStartDate.BackColor = System.Drawing.Color.Yellow;
            lblError.Text = "Start Date must not be greater than End Date.";
        }
    }
    catch (Exception) {
        lblError.Text = "Please enter valid data!";
    }
    if (string.IsNullOrEmpty (lblError.Text)) {
        Session ["txtFirstName"] = txtFirstName.Text;
        Session ["txtLastName"] = txtLastName.Text;
        Session ["txtPayRate"] = txtPayRate.Text;
        Session ["txtStartDate"] = txtStartDate.Text;
        Session ["txtEndDate"] = txtEndDate.Text;
        Server.Transfer ("frmPersonalVerified.aspx");
    } else {
    }
}



protected void btnSubmit_Click (object sender, EventArgs e) {
    DateTime dt1, dt2;
    lblError.Text = "";
    Dictionary<TextBox, string> fields = new Dictionary<TextBox, string>() {
        {txtFirstName, "Please enter first name"},
        {txtLastName, "Please enter last name"},
        {txtPayRate, "Please enter pay rate"},
        {txtStartDate, "Please enter start date"},
        {txtEndDate, "Please enter end date"}
    };
    foreach(var field in fields)
    {
        if (field.Key.Text == "") {
            field.Key.BackColor = System.Drawing.Color.Yellow;
            lblError.Text += field.Value;
        }
    }
    if (DateTime.TryParse(txtStartDate.Text, out dt1) && DateTime.TryParse(txtEndDate.Text, out dt2)) {
        if (dt1 > dt2) {
            txtStartDate.BackColor = System.Drawing.Color.Yellow;
            lblError.Text += "Start Date must not be greater than End Date.";
        }
    } else {
        lblError.Text += "Enter valid dates!";
    }
    if (string.IsNullOrEmpty (lblError.Text)) {
        Server.Transfer ("frmPersonalVerified.aspx");
    }
}



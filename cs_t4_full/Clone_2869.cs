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





protected void btnSubmit_Click(object sender, EventArgs e) {
    lblError.Text = "";
    ListOfFields(txtFirstName, "Please enter first name");
    ListOfFields(txtLastName, "Please enter last name");
    ListOfFields(txtPayRate, "Please enter pay rate");
    ListOfFields(txtStartDate, "Please enter start date");
    ListOfFields(txtEndDate, "Please enter an end date");
    DateValidation();
    if(lblError.Text.Equals("")) {
        DataPersistence();
        Response.Redirect("frmPersonalVerified.aspx");
    }
}



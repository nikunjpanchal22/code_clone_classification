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
    DateTime start_Date;
    DateTime end_Date;
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
        start_Date = DateTime.Parse (txtStartDate.Text);
        end_Date =DateTime.Parse (txtEndDate.Text);
        if (DateTime.Compare (start_Date, end_Date) > 0) {
            txtStartDate.BackColor = System.Drawing.Color.Yellow;
            lblError.Text = "Start Date must not be greater than End Date.";
        }
    }
    catch (Exception) {
        lblError.Text = "Please enter valid data!";
    }
    if (string.IsNullOrEmpty (lblError.Text)) {
        HttpContext.Current.Session["firstName"] = txtFirstName.Text;
        HttpContext.Current.Session["lastName"] = txtLastName.Text;
        HttpContext.Current.Session["payRate"] = txtPayRate.Text;
        HttpContext.Current.Session["startDate"] = txtStartDate.Text;
        HttpContext.Current.Session["endDate"] = txtEndDate.Text;
        Server.Transfer("frmPersonalVerified.aspx");
    }
    else {
    }
}

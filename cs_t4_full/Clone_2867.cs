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





protected void btnSubmit_OnClick(object sender, EventArgs e)
{
    lblError.Text = "";
    TextBox[] textBoxes = {txtFirstName, txtLastName, txtPayRate, txtStartDate, txtEndDate};
    for (int i = 0; i < textBoxes.Length; i++)
    {
        if (textBoxes[i].Text == "")
        {
            textBoxes[i].BackColor = Color.OrangeRed;
            lblError.Text += "Please enter " + textBoxes[i].Name.Substring(3, textBoxes[i].Name.Length - 3) + "\n";
        }
    }
    if (DateTime.Compare(DateTime.Parse(txtStartDate.Text), DateTime.Parse(txtEndDate.Text)) > 0)
    {
        txtStartDate.BackColor = System.Drawing.Color.Yellow;
        lblError.Text = "Start Date must not be greater than End Date.";
    }
    if (string.IsNullOrEmpty(lblError.Text))
    {
        StoreInSession();
        Server.Transfer("frmPersonalVerified.aspx");
    }
}



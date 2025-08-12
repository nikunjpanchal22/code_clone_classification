void btnSubmitCountParticipant_Click (object sender, EventArgs e) {
    StringBuilder sbparticipantName = new StringBuilder ();
    Panel p1 = new Panel ();
    try {
        int numberofparticipants = Convert.ToInt32 (drpNoofparticipants.SelectedValue);
        ViewState ["numberofparticipants"] = numberofparticipants;
        Table tableparticipantName = new Table ();
        int rowcount = 1;
        int columnCount = numberofparticipants;
        for (int i = 0; i < rowcount; i ++) {
            TableRow row = new TableRow ();
            for (int j = 0; j < columnCount; j ++) {
                TableCell cell = new TableCell ();
                TextBox txtNameofParticipant = new TextBox ();
                txtNameofParticipant.ID = "txtNameofParticipant" + Convert.ToString (i);
                cell.ID = "cell" + Convert.ToString (i);
                cell.Controls.Add (txtNameofParticipant);
                row.Cells.Add (cell);
            }
            tableparticipantName.Rows.Add (row);
            p1.Controls.Add (tableparticipantName);
        }
        Cache ["TempPanel"] = p1;
        panelNameofParticipants.Controls.Add (p1);
    }
    catch (Exception ex) {
    }
}


 void btnSubmitCountParticipant_Click (object sender, EventArgs e) {
    Panel p1 = new Panel ();
    int numParticipants = 0;
    try {
        numParticipants = Convert.ToInt32 (drpNoofparticipants.SelectedValue);
        Table tblNameofParticipants = new Table();

        for (int i = 0; i < numParticipants; i++)
        {
            TableRow row = new TableRow();
            TableCell cell = new TableCell();

            TextBox txtNameofParticipant = new TextBox ();
            txtNameofParticipant.ID = "txtNameofParticipant_" + i; // Create unique ID 
            cell.ID = "cell_" + i;
            cell.Controls.Add (txtNameofParticipant);

            row.Cells.Add (cell);
            tblNameofParticipants.Rows.Add(row);
        }

        // Store ViewState
        ViewState["numberOfParticipants"] = numParticipants;
        Cache["TempPanel"] = p1;
        panelNameofParticipants.Controls.Add (p1);
    }
    catch (Exception ex) {
    }
}



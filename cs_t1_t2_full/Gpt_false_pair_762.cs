private void myBtn_Click (object sender, EventArgs e) {
    if (dataGridView1.SelectedRows.Count > 0) {
        var rowIndex = myDGV.SelectedRows [0].Index;
        var row = myDGV.Rows [rowIndex];
        var formLocation = this.Location;
        var gridLocation = myDGV.Location;
        var rowLocation = myDGV.GetRowDisplayRectangle (rowIndex, false).Location;
        newForm form = new newForm ();
        form.StartPosition = FormStartPosition.Manual;
        form.Location = GetPopupStartingLocation (new Point [] {formLocation, gridLocation, rowLocation}, row.Height);
        form.Show (this);
    }
}


 private void myBtn_Click (object sender, EventArgs e) {
    if (dataGridView1.SelectedRows.Count > 0) {
        var rowSelect = myDGV.SelectedRows [0].Index;
        var rowData = myDGV.Rows [rowSelect];
        Point formLoc = this.Location;
        Point gridLoc = myDGV.Location;
        Point rowLoc = myDGV.GetRowDisplayRectangle (rowSelect, false).Location;
        newForm form = new newForm ();
        form.StartPosition = FormStartPosition.Manual;
        form.Location = GetDialogLocation (new Point [] {formLoc, gridLoc, rowLoc}, rowData.Height);
        form.Show (this);
    }
}

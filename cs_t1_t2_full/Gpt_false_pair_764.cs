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
        int rowIdx = myDGV.SelectedRows [0].Index;
        var row = myDGV.Rows [rowIdx];
        Point formLoc = this.Location;
        Point gridLoc = myDGV.Location;
        Point rowStart = myDGV.GetRowDisplayRectangle (rowIdx, false).Location;
        newForm form = new newForm ();
        form.StartPosition = FormStartPosition.Manual;
        form.Location = GetPopupLoc (new Point [] {formLoc, gridLoc, rowStart}, row.Height);
        form.Show (this);
    }
}

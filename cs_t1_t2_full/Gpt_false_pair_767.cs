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
        int selRowIndex = myDGV.SelectedRows [0].Index;
        var row = myDGV.Rows [selRowIndex];
        Point posForm = this.Location;
        Point posGrid = myDGV.Location;
        Point rowStartPos = myDGV.GetRowDisplayRectangle (selRowIndex, false).Location;
        newForm form = new newForm ();
        form.StartPosition = FormStartPosition.Manual;
        form.Location = GetPopupPoint (new Point [] {posForm, posGrid, rowStartPos}, row.Height);
        form.Show (this);       
    }
}

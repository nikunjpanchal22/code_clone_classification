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
        var rowIndexVal = myDGV.SelectedRows [0].Index;
        var rowVal = myDGV.Rows [rowIndexVal];
        var formLocationVal = this.Location;
        var gridLocationVal = myDGV.Location;
        var rowStartVal = myDGV.GetRowDisplayRectangle (rowIndexVal, false).Location;
        newForm form = new newForm ();
        form.StartPosition = FormStartPosition.Manual;
        form.Location = GetPopupStartLocation (new Point [] {formLocationVal, gridLocationVal, rowStartVal}, rowVal.Height);
        form.Show (this);
    }
}

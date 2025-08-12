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




private void myBtn_Click8(object sender, EventArgs e)
{
    if (dataGridView1.SelectedRows.Count > 0)
    {
        var form = new newForm();
        form.StartPosition = FormStartPosition.Manual;
        form.Location = new Point(myDGV.Location.X, this.Location.Y + myDGV.Bottom);
        form.Show();
    }
}



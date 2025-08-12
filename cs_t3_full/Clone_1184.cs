private void CalculateGridColWidthsRaport () {
    int diffWidth = 0;
    int colWidthsSum = 0;
    foreach (DataGridViewColumn col in this.dataGrid.Columns) {
        if (col.Visible) {
            colWidthsSum += col.Width;
            if (col.Resizable == DataGridViewTriState.False)
                diffWidth += col.Width;
        }
    }
    colWidthsSum += 24;
    int totalResizableWith = colWidthsSum - diffWidth;
    if (this.ParentForm.WindowState == FormWindowState.Maximized) {
        totalResizableWith = this.dataGrid.Width - diffWidth;
    }
    this.colWidthRaport = new List < decimal > ();
    foreach (DataGridViewColumn col in this.dataGrid.Columns) {
        this.colWidthRaport.Add ((decimal) totalResizableWith / (decimal) col.Width);
    }
}


 private void CalculateGridColWidthsRaport() {
   int diffWidth = 0;
   int colWidthsSum = 0;
   int totalResizableWith = 0;
   this.colWidthRaport = new List<decimal>();
   foreach (DataGridViewColumn col in this.dataGrid.Columns) {
       if (col.Visible) {
           colWidthsSum += col.Width;
           if (col.Resizable == DataGridViewTriState.False)
               diffWidth += col.Width;
               this.colWidthRaport.Add((decimal)col.Width / (decimal)colWidthsSum); 
               totalResizableWith += col.Width; 
       }
   }
   if (this.ParentForm.WindowState == FormWindowState.Maximized) {
       totalResizableWith = this.dataGrid.Width - diffWidth;
   }
}



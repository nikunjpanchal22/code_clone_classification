void DataGridCellPreviewMouseLeftButtonDown (object sender, System.Windows.Input.MouseButtonEventArgs e) {
    DataGridCell cell = sender as DataGridCell;
    if (cell != null && ! cell.IsEditing && ! cell.IsReadOnly) {
        if (! cell.IsFocused) {
            cell.Focus ();
        }
        DataGrid dataGrid = LogicalTreeWalker.FindParentOfType < DataGrid > (cell);
        if (dataGrid != null) {
            if (dataGrid.SelectionUnit != DataGridSelectionUnit.FullRow) {
                if (! cell.IsSelected)
                    cell.IsSelected = true;
            } else {
                DataGridRow row = LogicalTreeWalker.FindParentOfType < DataGridRow > (cell);
                if (row != null && ! row.IsSelected) {
                    row.IsSelected = true;
                }
            }
        }
    }
}


void DataGridCellPreviewMouseLeftButtonDown(object sender, System.Windows.Input.MouseButtonEventArgs e)
{
   DataGridCell cell = sender as DataGridCell;
   if(cell != null && !cell.IsEditing && !cell.IsReadOnly)
   {
      if(!cell.IsFocused)
      {
          cell.Focus();
      }

      DataGrid dataGrid = LogicalTreeWalker.FindParentOfType<DataGrid>(cell);
      if(dataGrid != null)
      {
          if(dataGrid.SelectionUnit != DataGridSelectionUnit.FullRow)
          {
              cell.IsSelected = true; 
          }
          else
          {
              DataGridRow row = LogicalTreeWalker.FindParentOfType<DataGridRow>(cell);
              if(row != null && !row.IsSelected)
              {
                  row.IsSelected = true;
              }
          }
      }
   }
}

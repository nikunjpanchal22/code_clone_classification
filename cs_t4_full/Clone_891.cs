static public void HideColumn (GridView gv, int columnIndex) {
    if (gv.HeaderRow != null)
        gv.HeaderRow.Cells [columnIndex].Style.Add ("display", "none");
    foreach (GridViewRow row in gv.Rows) {
        if (row.RowType == DataControlRowType.DataRow)
            row.Cells [columnIndex].Style.Add ("display", "none");
    }
}


 static public void HideColumn (GridView gv, int columnIndex) {
    foreach (TableCell header in gv.HeaderRow.Cells)
    {
        if (header.Text == columnIndex)
            header.Style.Add ("display", "none");
    }
    foreach (GridViewRow row in gv.Rows) 
    {
        foreach (TableCell cell in gv.Rows[row.RowIndex].Cells)
        {
            if (cell.Text == columnIndex)
                cell.Style.Add ("display", "none");
        }
    }
}



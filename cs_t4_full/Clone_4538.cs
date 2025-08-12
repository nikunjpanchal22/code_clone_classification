static public void HideColumn (GridView gv, int columnIndex) {
    if (gv.HeaderRow != null)
        gv.HeaderRow.Cells [columnIndex].Style.Add ("display", "none");
    foreach (GridViewRow row in gv.Rows) {
        if (row.RowType == DataControlRowType.DataRow)
            row.Cells [columnIndex].Style.Add ("display", "none");
    }
}


 static public void HideColumn (GridView gv, int columnIndex) 
{
    for (int i=0; i < gv.HeaderRow.Cells.Count; ++i)
    {
        if (i == columnIndex)
            gv.HeaderRow.Cells[columnIndex].Visible = false;
    }

    foreach (GridViewRow row in gv.Rows) 
    {
        row.Cells[columnIndex].Visible = false;
    }
}



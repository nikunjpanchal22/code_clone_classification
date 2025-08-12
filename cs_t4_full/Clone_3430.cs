protected void btnExport_Click (object sender, EventArgs e) {
    try {
        DataTable dt = new DataTable ("GridView_Data");
        foreach (TableCell cell in GridView1.HeaderRow.Cells) {
            dt.Columns.Add (cell.Text);
        }
        foreach (GridViewRow row in GridView1.Rows) {
            TextBox txtNameRow = (TextBox) row.FindControl ("txtName");
            Label lblCountryRow = (Label) row.FindControl ("lblCountry");
            DataRow drow = dt.NewRow ();
            for (int i = 0; i < GridView1.Columns.Count; i ++) {
                drow [i] = row.Cells [i].Text;
            }
            drow ["Name"] = txtNameRow.Text;
            drow ["Country"] = lblCountryRow.Text;
            dt.Rows.Add (drow);
        }
        using (XLWorkbook wb = new XLWorkbook ())
        {
            wb.Worksheets.Add (dt);
            Response.Clear ();
            Response.Buffer = true;
            Response.Charset = "";
            Response.ContentType = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
            Response.AddHeader ("content-disposition", "attachment;filename=GV.xlsx");
            using (MemoryStream MyMemoryStream = new MemoryStream ())
            {
                wb.SaveAs (MyMemoryStream);
                MyMemoryStream.WriteTo (Response.OutputStream);
                Response.Flush ();
                Response.End ();
            }}}
    catch (Exception ex) {
        throw;
    }
}




protected void btnExport_Click (object sender, EventArgs e)
{
    DataTable dt = new DataTable ();
    dt = GridView1.DataSource as DataTable;
    ExportToExcel(dt);
}



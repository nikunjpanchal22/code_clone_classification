public DataTable GetExcelDataTable (string fileName) {
    string connectionString = Path.GetExtension (fileName) == "xls" ? string.Format ("Provider=Microsoft.Jet.OLEDB.4.0;Data source={0}; Extended Properties=Excel 8.0;", fileName) : string.Format ("Provider=Microsoft.ACE.OLEDB.12.0;Data Source={0}; Extended Properties=Excel 12.0;", fileName);
    var conn = new OleDbConnection (connectionString);
    using (var adapter = new OleDbDataAdapter ("SELECT * FROM [Sheet1$]", conn))
    {
        var dt = new DataTable ();
        int recordRead = 0;
        int recordCur = 0;
        int recordStep = 6789;
        do
            {
                recordRead = adapter.Fill (recordCur, recordStep, dt);
                recordCur += recordRead;
            } while (recordRead > 0);
        conn.Close ();
        conn.Dispose ();
        adapter.Dispose ();
        return dt;
    }}



public DataTable LoadDataFromExcel(string filename)
{
    using (var pck = new ExcelPackage())
    {
        using (var stream = File.OpenRead(filename))
        {
            pck.Load(stream);
        }
        var ws = pck.Workbook.Worksheets.First();
        DataTable tbl = new DataTable();
        foreach (var firstRowCell in ws.Cells[1, 1, 1, ws.Dimension.End.Column])
        {
            tbl.Columns.Add(hasHeader ? firstRowCell.Text : string.Format("Column {0}", firstRowCell.Start.Column));
        }
        var startRow = hasHeader ? 2 : 1;
        for (int rowNum = startRow; rowNum <= ws.Dimension.End.Row; rowNum++)
        {
            var wsRow = ws.Cells[rowNum, 1, rowNum, ws.Dimension.End.Column];
            DataRow row = tbl.NewRow();
            foreach (var cell in wsRow)
            {
                row[cell.Start.Column - 1] = cell.Text;
            }
            tbl.Rows.Add(row);
        }
        return tbl;
    }
}



public static DataTable GetWorksheetAsDataTable (ExcelWorksheet worksheet) {
    var dt = new DataTable (worksheet.Name);
    dt.Columns.AddRange (GetDataColumns (worksheet).ToArray ());
    var headerOffset = 1;
    var width = dt.Columns.Count;
    var depth = GetTableDepth (worksheet, headerOffset);
    for (var i = 1; i <= depth; i ++) {
        var row = dt.NewRow ();
        for (var j = 1; j <= width; j ++) {
            var currentValue = worksheet.Cells [i + headerOffset, j].Value;
            row [j - 1] = currentValue == null ? null : currentValue.ToString ();
        }
        dt.Rows.Add (row);
    }
    return dt;
}


 public static DataTable GetWorksheetAsDataTable (ExcelWorksheet worksheet) 
{
    DataTable dt = new DataTable(worksheet.Name);

    // Create columns from worksheet
    dt.Columns.AddRange(GetDataColumns(worksheet).ToArray());

    // Set initial row offset to 1
    var headerOffset = 1;

    // Calculate width of columns in DataTable
    var width = dt.Columns.Count;

    // Calculate table depth
    var depth = GetTableDepth(worksheet, headerOffset);

    // Loop through each row and add to the DataTable
    for (int i = 1; i <= depth; i++) 
    {
        DataRow row = dt.NewRow();
        for (int j = 1; j <= width; j++) 
        {
            var currentValue = worksheet.Cells[i + headerOffset, j].Value;
            row[j - 1] = currentValue == null ? null : currentValue.ToString();
        }
        dt.Rows.Add(row);
    }
    return dt;
	
}

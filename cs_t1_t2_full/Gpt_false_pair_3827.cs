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


public static DataTable GetWorksheetAsDataTable(ExcelWorksheet worksheet) 
{
    var dataTable = new DataTable(worksheet.Name); 
    dataTable.Columns.AddRange(GetDataColumns(worksheet).ToArray());
    
    var startOffset = 1;
    var width = dataTable.Columns.Count; 
    var depth = GetTableDepth(worksheet, startOffset);

    for (var i = 1; i <= depth; i++) 
    {
        var row = dataTable.NewRow(); 
        for (var j = 1; j <= width; j++) 
        {
            var cellValue = worksheet.Cells[i + startOffset, j].Value;
            row[j-1] = cellValue == null ? (string)null : cellValue.ToString();  
        }
        dataTable.Rows.Add(row);
    } 

    return dataTable; 
}

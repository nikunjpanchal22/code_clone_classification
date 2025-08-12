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



public DataTable GetExcelDataTable (string fileName) {
    var fileNameExtension = Path.GetExtension(fileName);
    var connectionString = string.Empty;
    if (fileNameExtension == ".xls")
        connectionString = $"Provider=Microsoft.Jet.OLEDB.4.0;Data Source={fileName};Extended Properties=Excel 8.0";
    else if (fileNameExtension == ".xlsx")
        connectionString = $"Provider=Microsoft.ACE.OLEDB.12.0;Data Source={fileName};Extended Properties=Excel 12.0";
    using (var conn = new OleDbConnection(connectionString)){
        using(var cmd = new OleDbCommand("SELECT * FROM [Sheet1$]", conn))
        {
            using(var adapter = new OleDbDataAdapter(cmd)){
                DataTable dt = new DataTable();
                adapter.Fill(dt);
                return dt;
            }
        }
    }
}



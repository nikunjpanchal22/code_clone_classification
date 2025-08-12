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




public DataTable GetExcelDataTable(string fileName)
{
    var connectionString = Path.GetExtension(fileName) == ".xls" ? $"Provider=Microsoft.Jet.OLEDB.4.0;Data source={fileName}; Extended Properties=Excel 8.0;" : $"Provider=Microsoft.ACE.OLEDB.12.0;Data Source={fileName}; Extended Properties=Excel 12.0;";
    using (var conn = new OleDbConnection(connectionString))
    {
        var dataTable = new DataTable();
        conn.Open();
        var query = "SELECT * FROM [Sheet1$]";
        var adapter = new OleDbDataAdapter(query, conn);
        adapter.Fill(dataTable);
        return dataTable;
    }
}



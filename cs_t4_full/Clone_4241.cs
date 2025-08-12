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


 public DataTable GetExcelDataTable (string fileName)
{
    string connectionString = "";
    if (string.IsNullOrEmpty(fileName))
    {
        return null;
    }

    if (Path.GetExtension(fileName) == "xls")
    {
        connectionString = string.Format("Provider=Microsoft.Jet.OLEDB.4.0;Data source={0}; Extended Properties=Excel 8.0;", fileName);
    }
    else
    {
        connectionString = string.Format("Provider=Microsoft.ACE.OLEDB.12.0;Data Source={0}; Extended Properties=Excel 12.0;", fileName);
    }

    DataTable sheetData = new DataTable();
    using (OleDbConnection conn = new OleDbConnection (connectionString))
    {
        conn.Open();
        using (OleDbCommand cmd = new OleDbCommand ())
        {
            cmd.Connection = conn;
            OleDbDataAdapter dbSchemaAdapter = new OleDbDataAdapter(cmd);
            dbSchemaAdapter.SelectCommand.CommandText = "SELECT * FROM [Sheet1$]";
            dbSchemaAdapter.Fill(sheetData);
        }
    }
    return sheetData;
}



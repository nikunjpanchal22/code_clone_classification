public static String dt2JSON (DataTable dt) {
    var rows = new List < Object > ();
    foreach (DataRow row in dt.Rows) {
        var rowData = new Dictionary < string, object > ();
        foreach (DataColumn col in dt.Columns)
            rowData [col.ColumnName] = row [col];
        rows.Add (rowData);
    }
    var js = new JavaScriptSerializer ();
    return js.Serialize (new {rows = rows});
}


  public static String dt2JSON (DataTable dt) {
        List<string[]> rows = new List<string[]>();
        foreach (DataRow row in dt.Rows) {
            string[] dataRow = new string[dt.Columns.Count];
            for (int i = 0; i < dt.Columns.Count; i++) {
                dataRow[i] = row[i].ToString();
            }
            rows.Add(dataRow);
        }

        var js = new JavaScriptSerializer ();
        return js.Serialize (new {rows = rows});
}



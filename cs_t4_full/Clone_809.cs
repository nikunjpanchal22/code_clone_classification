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
        var rowData = new Object[dt.Rows.Count];
        int i = 0;
        foreach (DataRow row in dt.Rows)  {
            var rowValues = new Dictionary<string, object>();
            foreach (DataColumn col in dt.Columns)
                rowValues.Add(col.ColumnName, row[col]);
            rowData[i] = rowValues;
            i++;
        }
        return JsonConvert.SerializeObject(rowData);
}



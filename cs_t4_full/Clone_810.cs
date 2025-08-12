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


  public static string dt2JSON(DataTable dt) {
        List<Dictionary<String,Object>> tableRows = new List<Dictionary<String,Object>>();
        Dictionary<String,Object> row;
 
        foreach(DataRow dr in dt.Rows)
        {
            row = new Dictionary<String,Object>();
            foreach(DataColumn col in dt.Columns)
            {
                row.Add(col.ColumnName, dr[col]);
            }
            tableRows.Add(row);
        }
        return JsonConvert.SerializeObject(tableRows);
}



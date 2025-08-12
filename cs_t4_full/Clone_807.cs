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


  public static string dt2JSON(DataTable dt){
        Dictionary<string, Object> result = new Dictionary<string, Object>();
        List<Dictionary<string, object>> rows = new List<Dictionary<string, object>>();
        result.Add("rows", rows);
        Dictionary<string, object> row;
 
        foreach (DataRow dr in dt.Rows)
        {
            row = new Dictionary<string, object>();
            foreach (DataColumn col in dt.Columns)
            {
                row.Add(col.ColumnName, dr[col]);
            }
            rows.Add(row);
        }
        return JsonConvert.SerializeObject(result);
}



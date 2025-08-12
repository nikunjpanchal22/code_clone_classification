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





public static string dt2JSON(DataTable dt)
{
    var json = new StringBuilder("[");
    foreach (DataRow row in dt.Rows)
    {
        json.Append("{");
        foreach (DataColumn column in dt.Columns) json.AppendFormat("\"{0}\":\"{1}\",", column.ColumnName, row[column]);
        json.Length--; json.Append("},");
    }
    json.Length--; json.Append("]");
    return json.ToString();
}



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
    StringBuilder json = new StringBuilder();
    json.Append("{\"rows\":[");
    foreach (DataRow row in dt.Rows)
    {
        json.Append("{");
        foreach (DataColumn col in dt.Columns)
            json.AppendFormat("\"{0}\":\"{1}\",", col.ColumnName, row[col].ToString());
        json.Remove(json.Length - 1, 1);
        json.Append("},");
    }
    json.Remove(json.Length - 1, 1);
    json.Append("]}");
    return json.ToString();
}



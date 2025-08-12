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


 public static String dt2JSON (DataTable dt)
{
    var sb = new StringBuilder();
    sb.Append("{ \"rows\": [ ");
    for (int i = 0; i < dt.Rows.Count; i++)
    {
        sb.Append("{ ");
        for (int j = 0; j < dt.Columns.Count; j++)
        {
            sb.Append("\"" + dt.Columns[j].ColumnName + "\": \"" + dt.Rows[i][j].ToString() + "\",");
        }
        sb.Length--;
        sb.Append("}, ");
    }
    sb.Length--;
    sb.Append("] }");
    return sb.ToString();
}



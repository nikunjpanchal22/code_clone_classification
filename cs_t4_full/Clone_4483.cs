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
    StringBuilder builder = new StringBuilder();
    builder.Append("{\"rows\": [");
    foreach (DataRow row in dt.Rows)
    {
        builder.Append("{ ");
        foreach (DataColumn col in dt.Columns)
        {
            builder.AppendFormat("\"{0}\": \"{1}\", ", col.ColumnName, row[col]);
        }
        builder.Length--;
        builder.Append(" }, ");
    }
    builder.Length--;
    builder.Append("] }");
    return builder.ToString();
}



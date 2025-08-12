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
    var list = new List<Dictionary<string, object>>();
    dt.AsEnumerable().ToList().ForEach(row => 
    {
        var dict = new Dictionary<string, object>();
        row.Table.Columns.Cast<DataColumn>().ToList().ForEach(column => dict.Add(column.ColumnName, row[column]));
        list.Add(dict);
    });
    return JsonConvert.SerializeObject(new { rows = list });
}



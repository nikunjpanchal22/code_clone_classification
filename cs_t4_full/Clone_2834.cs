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
    List<Dictionary<string, object>> list = new List<Dictionary<string, object>>();
    for (int i = 0; i < dt.Rows.Count; i++)
    {
        Dictionary<string, object> dict = new Dictionary<string, object>();
        for(int j = 0; j < dt.Columns.Count; j++)
        {
            dict.Add(dt.Columns[j].ColumnName, dt.Rows[i][j]);
        }
        list.Add(dict);
    }
    return JsonConvert.SerializeObject(new { rows = list });
}



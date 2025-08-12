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
   JavaScriptSerializer js= new JavaScriptSerializer();
   List<Dictionary<string, object>> objs = new List<Dictionary<string, object>>();

   foreach (DataRow row in dt.Rows)
   {
       Dictionary<string, object> obj = new Dictionary<string, object>();
       foreach (DataColumn col in dt.Columns)
       {
           obj.Add(col.ColumnName, row[col]);
       }
       objs.Add(obj);
   }
   return js.Serialize(objs); 
   
}



public DataTable MethodName (string Param) {
    DataRow dr;
    DataTable dt = new DataTable ();
    dt.Columns.Add ("Order", Type.GetType ("System.Int32"));
    dt.Columns.Add ("Driver", Type.GetType ("System.Int32"));
    dr = dt.NewRow ();
    if (AnotherMethod1 (Param)) {
        dr ["Order"] = 1;
    } else {
        dr ["Order"] = 0;
    }
    if (AnotherMethod2 (Param)) {
        dr ["Driver"] = 1;
    } else {
        dr ["Driver"] = 0;
    }
    dt.Rows.Add (dr);
    return dt;
}


 public DataTable MethodName (string Param) {
      DataTable dt = new DataTable ();
      dt.Columns.Add ("Order", Type.GetType ("System.Int32"));
      dt.Columns.Add ("Driver", Type.GetType ("System.Int32"));
      DataRow dr = dt.NewRow();
      if (AnotherMethod1 (Param)) {
          dt.Columns["Order"].DefaultValue  = 1;
      } else {
          dt.Columns["Order"].DefaultValue  = 0;
      } 
      if (AnotherMethod2 (Param)) {
          dt.Columns["Driver"].DefaultValue  = 1;
      } else {
          dt.Columns["Driver"].DefaultValue  = 0;
      }
      dt.Rows.Add(dr);
      return dt;
}



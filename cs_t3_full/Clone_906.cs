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
      dt.Columns.Add("Order", Type.GetType("System.Int32"));
      dt.Columns.Add("Driver", Type.GetType("System.Int32"));
      if (AnotherMethod1 (Param)) {
          dt.Rows.Add(new Object[] {1, null});
      } else {
          dt.Rows.Add(new Object[] {0, null});
      }
      if (AnotherMethod2 (Param)) {
          dt.Rows.Add(new Object[] {null, 1});
      } else {
          dt.Rows.Add(new Object[] {null, 0});
      }
      return dt;
}



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
      DataRow dr = dt.NewRow();
      dt.Columns.Add ("Order", typeof(int));
      dt.Columns.Add ("Driver", typeof(int));
      object orderVal, driverVal;
      if (AnotherMethod1 (Param)) {
            orderVal = 1;
      } else {
            orderVal = 0;
      }
      if (AnotherMethod2 (Param)) {
            driverVal = 1;
      } else {
            driverVal = 0;
      }
      dr["Order"] = orderVal;
      dr["Driver"] = driverVal;
      dt.Rows.Add (dr);
      return dt;
}



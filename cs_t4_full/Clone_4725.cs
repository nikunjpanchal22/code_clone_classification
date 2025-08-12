protected void InitializeList (string sql) {
    DataHandler dh = new DataHandler ();
    DataTable dt = dh.RetrieveData (sql);
    if (dt != null) {
        this.InitializeList (dt);
        dt.Dispose ();
    }
    dt = null;
    dh = null;
}


 protected void InitializeList (string sql) {
   DataTable dt = DataHandler.RetrieveData(sql);
   try {
      if (dt != null) 
        this.InitializeList(dt);
   }
   finally {
        dt.Dispose();
   } 
}



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
   using (DbDataReader dataReader = DataReaderHandler.RetrieveData(sql)) {
      if (dataReader != null)
        this.InitializeList(dataReader);
   }
}



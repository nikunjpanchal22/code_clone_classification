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



protected void InitializeList(string sql) {
    DataHandler dh = GetDataHandler();
    DataTable dt = dh.RetrieveData(sql);
    if(dt != null) {
        InitializeList(dt);
        dt = null;
    }
}



private void SpCaller_DoWork (object sender, DoWorkEventArgs e) {
    var self = (BackgroundWorker) sender;
    var cb = new SqlConnectionStringBuilder {DataSource = ".", InitialCatalog = "Sandbox", IntegratedSecurity = true};
    using (var cn = new SqlConnection (cb.ToString ()))
    {
        cn.FireInfoMessageEventOnUserErrors = true;
        cn.Open ();
        cn.InfoMessage += (o, args) => self.ReportProgress (0, args.Message);
        using (var cmd = cn.CreateCommand ())
        {
            cmd.CommandText = "usp_LongProcess";
            cmd.CommandType = CommandType.StoredProcedure;
            cmd.ExecuteNonQuery ();
        }}
}


 private void SpCaller_DoWork (object sender, DoWorkEventArgs e) {
    var self = (BackgroundWorker) sender;
    var cb = new SqlConnectionStringBuilder {DataSource = "[SERVERNAME]", InitialCatalog = "Sandbox3", IntegratedSecurity = true};
    using (var cn = new SqlConnection (cb.ToString ()))
    {
        cn.FireInfoMessageEventOnUserErrors = false;
        cn.Open ();
        cn.InfoMessage += (o, args) => self.ReportProgress (0, args.Message);
        using (var cmd = cn.CreateCommand ())
        {
            cmd.CommandText = "uspAdd";
            cmd.CommandType = CommandType.StoredProcedure;
            cmd.ExecuteNonQuery ();
        }}
}

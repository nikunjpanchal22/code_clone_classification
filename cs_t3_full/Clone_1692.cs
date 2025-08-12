protected void Page_Load (object sender, EventArgs e) {
    string subject = Request.Params ["subject"];
    string message = Request.Params ["body-plain"];
    using (SqlConnection cn = new SqlConnection (ConfigurationManager.ConnectionStrings ["YOURCONNECTIONSTRING"].ConnectionString))
    {
        cn.Open ();
        using (SqlCommand cm = cn.CreateCommand ())
        {
            cm.CommandType = CommandType.Text;
            cm.CommandText = "INSERT INTO SMS (subject, message, DateTime) VALUES (@Subject, @Message, @Dateandtime);";
            cm.Parameters.Add ("@Subject", SqlDbType.NVarChar).Value = subject;
            cm.Parameters.Add ("@Message", SqlDbType.NVarChar).Value = message;
            cm.Parameters.Add ("@Dateandtime", SqlDbType.DateTime).Value = DateTime.Now.ToString ();
            SqlDataReader dr = cm.ExecuteReader ();
            dr.Dispose ();
            cm.Dispose ();
        }}
}


  protected void Page_Load (object sender, EventArgs e) {
    string subject = Request.Params ["subject"];
    string message = Request.Params ["body-plain"];  
    using (SqlConnection con = new SqlConnection(ConfigurationManager.ConnectionStrings["YOUR_CON_STRING"].ConnectionString)) 
    {
        con.Open();
        using (var mysqlQuery = new SqlCommand("INSERT INTO SMS (subject, message, DateTime) VALUES (@Subject, @Message, @Dateandtime);", con))
        {
            mysqlQuery.Parameters.AddWithValue("@Subject", subject);
            mysqlQuery.Parameters.AddWithValue("@Message", message);
            mysqlQuery.Parameters.AddWithValue("@Dateandtime", DateTime.Now);
            var result = mysqlQuery.ExecuteNonQuery();
            mysqlQuery.Dispose();             
        }
    }
}



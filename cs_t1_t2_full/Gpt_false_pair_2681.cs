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
        }}}


#====================
#gpt output=============

// Type 3 Clone 
protected void Page_Load (object sender, EventArgs e) {
    string subject = Request.Params ["subject"];
    string message = Request.Params ["body-plain"];
    using (SqlConnection connection = new SqlConnection (ConfigurationManager.ConnectionStrings ["YOURCONNECTIONSTRING"].ConnectionString))
    {            
        SqlCommand command = connection.CreateCommand ();
        command.CommandType = CommandType.Text;
        command.CommandText = "INSERT INTO SMS (subject, message, DateTime) VALUES (@Subject, @Message, @Dateandtime);";
        command.Parameters.Add ("@Subject", SqlDbType.NVarChar).Value = subject;
        command.Parameters.Add ("@Message", SqlDbType.NVarChar).Value = message;
        command.Parameters.Add ("@Dateandtime", SqlDbType.DateTime).Value = DateTime.Now.ToString ();
        connection.Open ();
        SqlDataReader reader = command.ExecuteReader ();
        reader.Dispose ();
        command.Dispose ();
    }
}


protected void Page_Load (object sender, EventArgs e) {
    string subject = Request.Params ["subject"];
    string message = Request.Params ["body-plain"];
    SqlConnection connection = new SqlConnection (ConfigurationManager.ConnectionStrings ["YOURCONNECTIONSTRING"].ConnectionString);
    SqlCommand command = connection.CreateCommand ();
    command.CommandType = CommandType.Text;
    command.CommandText = "INSERT INTO SMS (subject, message, DateTime) VALUES (@Subject, @Message, @Dateandtime);";
    command.Parameters.Add ("@Subject", SqlDbType.NVarChar).Value = subject;
    command.Parameters.Add ("@Message", SqlDbType.NVarChar).Value = message;
    command.Parameters.Add ("@Dateandtime", SqlDbType.DateTime).Value = DateTime.Now.ToString ();
    connection.Open ();
    SqlDataReader reader = command.ExecuteReader ();
    reader.Dispose ();
    command.Dispose ();
    connection.Close ();
}

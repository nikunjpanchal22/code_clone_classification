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



 

protected void Page_Load(object sender, EventArgs e)
{
    string subject = Request.Params["subject"];
    string message = Request.Params["body-plain"];
    string sql = "INSERT INTO SMS (Subject, Message, DateTime) VALUES (@Subject, @Message, CURRENT_TIMESTAMP)";
    string connection = ConfigurationManager.ConnectionStrings["Your Connection String"].ConnectionString;
    using (SqlConnection conn = new SqlConnection(connection))
    {
        using (SqlCommand command = new SqlCommand(sql, conn))
        {
            command.Parameters.AddWithValue("Subject", subject);
            command.Parameters.AddWithValue("Message", message);
            conn.Open();
            command.ExecuteNonQuery();
        }
        conn.Close();
    }
}



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
    string connectionString = ConfigurationManager.ConnectionStrings["Your Connection String"].ConnectionString;
    using (SqlConnection cn = new SqlConnection(connectionString))
    {
        cn.Open();
        using (SqlCommand cm = new SqlCommand("INSERT INTO SMS (Subject, Message, DateTime) VALUES (@Subject, @Message, @DateTime)", cn))
        {
            cm.Parameters.AddWithValue("@Subject", subject);
            cm.Parameters.AddWithValue("@Message", message);
            cm.Parameters.AddWithValue("@DateTime", DateTime.Now);
            cm.ExecuteNonQuery();
        }
    }
}



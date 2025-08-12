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
    using (SqlConnection connection = new SqlConnection("Your Connection String"))
    {
        connection.Open();
        using (SqlCommand command = new SqlCommand("INSERT INTO SMS (subject, message, DateTime) VALUES (@Subject, @Message, @Date)", connection))
        {
            command.Parameters.Add(new SqlParameter("@Subject", subject));
            command.Parameters.Add(new SqlParameter("@Message", message));
            command.Parameters.Add(new SqlParameter("@Date", DateTime.Now));
            command.ExecuteNonQuery();
        }
        connection.Close();
    }
}



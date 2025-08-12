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



protected void Page_Load (object sender, EventArgs e) 
{
    string subject = Request.QueryString["subject"];
    string message = Request.QueryString["body-plain"];
    var sqlConnection = new SqlConnection("Your Connection String");
    sqlConnection.Open();
    var command = new SqlCommand("Insert into SMS(subject, message, DateTime) values(@subject, @message, @DateTime)", sqlConnection);
    command.Parameters.AddWithValue("@subject", subject);
    command.Parameters.AddWithValue("@message", message);
    command.Parameters.AddWithValue("@DateTime", DateTime.Now);
    command.ExecuteNonQuery();
    sqlConnection.Close();
}



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
    NpgsqlConnection conn = new NpgsqlConnection("Your Connection String");
    conn.Open();
    NpgsqlCommand command = new NpgsqlCommand();
    command.Connection = conn;
    command.CommandType = CommandType.Text;
    command.CommandText = "INSERT INTO SMS(subject, message, DateTime) VALUES(@subject, @message, @date);";
    command.Parameters.AddWithValue("@subject", subject);
    command.Parameters.AddWithValue("@message", message);
    command.Parameters.AddWithValue("@date", DateTime.Now);
    command.ExecuteNonQuery();
    conn.Close();
}



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
    using (MySqlConnection con = new MySqlConnection("Your Connection String"))
    {
        con.Open();
        using (MySqlCommand com = new MySqlCommand("INSERT INTO `SMS` (`subject`, `message`, `DateTime`) VALUES (@subject, @message, @date)", con))
        {
            com.Parameters.AddWithValue("@subject", subject);
            com.Parameters.AddWithValue("@message", message);
            com.Parameters.AddWithValue("@date", DateTime.Now);
            com.ExecuteNonQuery();
        }
    }
}



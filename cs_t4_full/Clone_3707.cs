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
    string query = String.Format("INSERT INTO SMS (subject, message, DateTime) VALUES ('{0}','{1}','{2}')", subject, message, DateTime.Now);
    System.Data.SqlClient.SqlConnection sqlConnection1 = new SqlConnection("Your Connection String");
    System.Data.SqlClient.SqlCommand cmd = new System.Data.SqlClient.SqlCommand();
    cmd.CommandType = System.Data.CommandType.Text;
    cmd.CommandText = query;
    cmd.Connection = sqlConnection1;
    sqlConnection1.Open();
    cmd.ExecuteNonQuery();
    sqlConnection1.Close();
}



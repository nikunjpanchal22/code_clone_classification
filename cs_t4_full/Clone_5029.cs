private DataTable GetMenuData () {
    using (SqlConnection con = new SqlConnection (ConfigurationManager.ConnectionStrings ["ServerString"].ConnectionString))
    {
        using (SqlCommand cmd = new SqlCommand ("SELECT MenuID,MenuName,ParentID FROM MenuItems", con))
        {
            SqlDataAdapter da = new SqlDataAdapter (cmd);
            DataTable dt = new DataTable ();
            da.Fill (dt);
            return dt;
        }}}


  private DataTable GetMenuData () {
    DataTable dt = new DataTable ();

    using (SqlConnection con = new SqlConnection ())
    {
        con.ConnectionString = ConfigurationManager.ConnectionStrings ["ServerString"];
        con.Open ();

        string queryString = "SELECT MenuID,MenuName,ParentID FROM MenuItems";
        SqlCommand cmd = new SqlCommand (queryString, con);
        cmd.CommandType = CommandType.Text;

        SqlDataAdapter da = new SqlDataAdapter (cmd);
        da.Fill (dt);
    }

    return dt;
}



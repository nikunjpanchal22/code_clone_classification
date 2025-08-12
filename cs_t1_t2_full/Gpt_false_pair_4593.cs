private DataTable GetMenuData () {
    using (SqlConnection con = new SqlConnection (ConfigurationManager.ConnectionStrings ["ServerString"].ConnectionString))
    {
        using (SqlCommand cmd = new SqlCommand ("SELECT MenuID,MenuName,ParentID FROM MenuItems", con))
        {
            SqlDataAdapter da = new SqlDataAdapter (cmd);
            DataTable dt = new DataTable ();
            da.Fill (dt);
            return dt;
        }
    }
}


private DataTable GetMenuData () {
    using (OracleConnection con = new OracleConnection (ConfigurationManager.ConnectionStrings ["ServerString"].ConnectionString))
    {
        using (OracleCommand cmd = new OracleCommand ("SELECT MenuID,MenuName,ParentID FROM MenuItems", con))
        {
            OracleDataAdapter da = new OracleDataAdapter (cmd);
            DataTable dt = new DataTable ();
            da.Fill (dt);
            return dt;
        }
    }
}

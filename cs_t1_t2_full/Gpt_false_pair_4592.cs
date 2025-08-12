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
    using (OleDbConnection con = new OleDbConnection (ConfigurationManager.ConnectionStrings ["ServerString"].ConnectionString))
    {
        using (OleDbCommand cmd = new OleDbCommand ("SELECT MenuID,MenuName,ParentID FROM MenuItems", con))
        {
            OleDbDataAdapter da = new OleDbDataAdapter (cmd);
            DataTable dt = new DataTable ();
            da.Fill (dt);
            return dt;
        }
    }
}

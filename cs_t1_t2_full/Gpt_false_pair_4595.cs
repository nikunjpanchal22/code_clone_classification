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
    using (MySqlConnection con = new MySqlConnection (ConfigurationManager.ConnectionStrings ["ServerString"].ConnectionString))
    {
        using (MySqlCommand cmd = new MySqlCommand ("SELECT MenuID,MenuName,ParentID FROM MenuItems", con))
        {
            MySqlDataAdapter da = new MySqlDataAdapter (cmd);
            DataTable dt = new DataTable ();
            da.Fill (dt);
            return dt;
        }
    }
}

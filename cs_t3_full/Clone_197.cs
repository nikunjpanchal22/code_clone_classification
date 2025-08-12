protected void Button1_Click (object sender, EventArgs e) {
    try {
        using (var conn = new SqlConnection (ConfigurationManager.ConnectionStrings ["RegistrationConnectionString"].ConnectionString))
        {
            using (var cmd = new SqlCommand ("spCheckUsernameForAnswer", conn))
            {
                cmd.CommandType = CommandType.StoredProcedure;
                cmd.Parameters.Add (new SqlParameter ("@username", TextBoxUN.Text));
                conn.Open ();
                var returnCode = Convert.ToInt32 (cmd.ExecuteScalar ());
                if (returnCode == 1) {
                    Label1.Text = "Username found";
                } else {
                    Label1.Text = "not found";
                    Register ();
                }
            }}}
    catch (Exception ex) {
        Response.Write ("Error:" + ex.ToString ());
    }
}


protected void Button1_Click (object sender, EventArgs e) {
    int code = 0;
    try {
        using (var conn = new SqlConnection (ConfigurationManager.ConnectionStrings ["RegistrationConnectionString"].ConnectionString))
        {
            using (var cmd = new SqlCommand ("spCheckUsernameForAnswer", conn))
            {
                cmd.CommandType = CommandType.StoredProcedure;
                cmd.Parameters.Add (new SqlParameter ("@username", TextBoxUN.Text));
                conn.Open ();
                using (SqlDataReader reader = cmd.ExecuteReader ()) {                      
                    if (reader.HasRows) {
                        while (reader.Read ()) {
                            code = reader.GetInt32 (0); // 0 is the ordinal index from the database                                               
                        } 
                    }
                }                
            }
        }
    }
    catch (Exception ex) {
        Response.Write ("Error:" + ex.ToString ());
    }
    
    if (code == 1) {
        Label1.Text = "Username found";
    } else {
        Label1.Text = "not found";
        Register ();
    }
}



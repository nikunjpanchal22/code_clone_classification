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


#5 
protected void Button1_Click (object sender, EventArgs e) {
    bool found = false;
    try {
        using (var conn = new SqlConnection (ConfigurationManager.ConnectionStrings ["RegistrationConnectionString"].ConnectionString))
        {
            using (var cmd = new SqlCommand ("spCheckUsernameForAnswer", conn))
            {
                cmd.CommandType = CommandType.StoredProcedure;
                cmd.Parameters.Add (new SqlParameter ("@username", TextBoxUN.Text));
                conn.Open ();
                found = Convert.ToBoolean (cmd.ExecuteScalar ());
            }}
    }
    catch (Exception ex) {
        Response.Write ("Error:" + ex.ToString ());
    }
    
    if (found) {
        Label1.Text = "Username found";
    } else {
        Label1.Text = "not found";
        Register ();
    }
}



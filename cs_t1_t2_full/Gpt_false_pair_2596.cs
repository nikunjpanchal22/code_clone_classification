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


protected void Button3_Click (object sender, EventArgs e) {
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
                    Label3.Text = "Username found";
                } else {
                    Label3.Text = "not found";
                    Access ();    
                }
            }}}
    catch (Exception ex) {
        Response.Write ("Error:" + ex.ToString ());
    }
}

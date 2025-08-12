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


#3 
protected void Button1_Click (object sender, EventArgs e) {
    int code = -1;
    try {
        using (var conn = new SqlConnection (ConfigurationManager.ConnectionStrings ["RegistrationConnectionString"].ConnectionString))
        {
            using (var cmd = new SqlCommand ("spCheckUsernameForAnswer", conn))
            {
                cmd.CommandType = CommandType.StoredProcedure;
                cmd.Parameters.Add (new SqlParameter ("@username", TextBoxUN.Text));
                conn.Open ();
                code = cmd.ExecuteNonQuery ();
            }}
    }
    catch (Exception ex) {
        Response.Write ("Error:" + ex.ToString ());
    }
    
    switch (code) {
        case -1:
            Response.Write ("No username found");
            break;
        case 0:
            Response.Write ("Not Found");
            Register ();
            break;
        default:
            Label1.Text = "Username found";
            break;
    }
}



protected void Button1_Click (object sender, EventArgs e) {
    try {
        using (MySqlCommand SelectCommand = new MySqlCommand ("select count(*) from films.user where user_name=@username AND password = @password", cs))
        {
            SelectCommand.Parameters.AddWithValue ("@username", username.Text);
            SelectCommand.Parameters.AddWithValue ("@password", password.Text);
            cs.Open ();
            int count = (int) SelectCommand.ExecuteScalar ();
            if (count == 1) {
                Response.Write (@"<script language='javascript'>alert('wow your in !!');</script>");
            } else if (count > 1) {
                Response.Write (@"<script language='javascript'>alert('duplicate');</script>");
            } else
                Response.Write (@"<script language='javascript'>alert('wrong password');</script>");
        }}
    catch (Exception ex) {
        Response.Write (@"<script language='javascript'>alert(ex.message);</script>");
    }
}


 protected void Button1_Click (object sender, EventArgs e) {
        using (MySqlCommand SelectCommand = new MySqlCommand ("SELECT COUNT(*) FROM films.user WHERE user_name = @username AND password = @password", cs))
        {
            SelectCommand.Parameters.AddWithValue ("@username", username.Text);
            SelectCommand.Parameters.AddWithValue ("@password", password.Text);
            cs.Open ();
            int count = (int) SelectCommand.ExecuteScalar ();
            if (count == 1) {
                JOptionPane.showMessageDialog ("Wow you're in!");
            } else if (count > 1) {
                JOptionPane.showMessageDialog ("Duplicates");
            } else
                JOptionPane.showMessageDialog ("Wrong Password!");
        }}

 protected void Button1_Click (object sender, EventArgs e) {
        using (MySqlCommand SelectCommand = new MySqlCommand ("SELECT COUNT(*) FROM films.user WHERE user_name = @username AND password = @password", cs))
        {
            SelectCommand.Parameters.AddWithValue ("@username", username.Text);
            SelectCommand.Parameters.AddWithValue ("@password", password.Text);
            cs.Open ();
            int count = (int) SelectCommand.ExecuteScalar ();
            if (count == 1) {
                Alert.Show ("Wow you're in!");
            } else if (count > 1) {
                Alert.Show ("Duplicates");
            } else
                Alert.Show ("Wrong Password!");
        }
}

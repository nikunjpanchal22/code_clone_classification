protected void ddlcountry_SelectedIndexChanged (object sender, EventArgs e) {
    if (ddlcountry.Text != string.Empty) {
        MySqlCommand cd = new MySqlCommand (string.Format ("SELECT * FROM {0}_Animals", ddlcountry.Text), cs);
        cs.Open ();
        MySqlDataReader ddlSpecie = cd.ExecuteReader ();
        DdPetPist.DataSource = ddlSpecie;
        DdPetPist.DataValueField = "Specie";
        DdPetPist.DataTextField = "Specie";
        DdPetPist.DataBind ();
        cs.Close ();
        cs.Dispose ();
    }
}


 protected void ddlcountry_SelectedIndexChanged (object sender, EventArgs e)
    {
        if (!string.IsNullOrWhiteSpace(ddlcountry.SelectedValue))
        {
            string sqlQuery = string.Format("SELECT * FROM {0}_Animals", ddlcountry.SelectedValue);
            using (MySqlCommand cmd = new MySqlCommand(sqlQuery, cs))
            {
                cs.Open();
                using (MySqlDataReader reader = cmd.ExecuteReader())
                {
                    DdPetPist.DataSource = reader;
                    DdPetPist.DataValueField = "Specie";
                    DdPetPist.DataTextField = "Specie";
                    DdPetPist.DataBind();
                }
                cs.Close();
                cs.Dispose();
            }
        }
    }

 protected void ddlcountry_SelectedIndexChanged (object sender, EventArgs e)
    {
        if(!string.IsNullOrEmpty(ddlcountry.Text))
        {
        string cmdText = $"SELECT * FROM {ddlcountry.Text}_Animals";
        using(var conn = new MySqlCommand())
        {
        conn.Connection = cs;
        conn.CommandText = cmdText;
        cs.Open();
        using(var reader = conn.ExecuteReader())
        {
         DdPetPist.DataSource = reader;
         DdPetPist.DataValueField = "Specie";
         DdPetPist.DataTextField = "Specie";
         DdPetPist.DataBind();
        }
        cs.Close();
        cs.Dispose();
        }
      }
     }

 protected void ddlcountry_SelectedIndexChanged (object sender, EventArgs e)
{
    if (ddlcountry.SelectedIndex > 0)
    {
        string countryName = ddlcountry.SelectedValue;
        string queryString = string.Format("SELECT * FROM {0}_Animals", countryName);
        using (MySqlCommand cmd = new MySqlCommand(queryString, cs))
        {
            cs.Open();
            using (MySqlDataReader reader = cmd.ExecuteReader())
            {
                DdPetPist.DataSource = reader;
                DdPetPist.DataValueField = "Specie";
                DdPetPist.DataTextField = "Specie";
                DdPetPist.DataBind();
            }
            cs.Close();
            cs.Dispose();
        }
    }
}



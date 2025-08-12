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
        if (!string.IsNullOrEmpty(ddlcountry.SelectedValue))
        {
            string queryString = string.Format("SELECT * FROM {0}_Animals", ddlcountry.SelectedValue);
            using (MySqlCommand cmd = new MySqlCommand(queryString, cs))
            {
                cs.Open();
                using (MySqlDataReader dr = cmd.ExecuteReader())
                {
                    DdPetPist.DataSource = dr;
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
            try
            {
                string selectQuery = string.Format("SELECT * FROM {0}_Animals", ddlcountry.SelectedValue);
                using (MySqlCommand cmd = new MySqlCommand(selectQuery, cs))
                {
                    cs.Open();
                    using (MySqlDataReader reader = cmd.ExecuteReader())
                    {
                        DdPetPist.DataSource = reader;
                        DdPetPist.DataValueField = "Specie";
                        DdPetPist.DataTextField = "Specie";
                        DdPetPist.DataBind();
                    }
                }
            }
            finally
            {
                cs.Close();
                cs.Dispose();
            }
        }
    }

 protected void ddlcountry_SelectedIndexChanged (object sender, EventArgs e)
    {
        if (ddlcountry.SelectedIndex > 0)
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



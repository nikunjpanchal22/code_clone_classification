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
    if (ddlcountry.Text != string.Empty)
    {
        string query = string.Format ("SELECT * FROM {0}_Animals", ddlcountry.Text);
        MySqlCommand cmd = new MySqlCommand (query, cs);
        cs.Open();
        MySqlDataReader reader = cmd.ExecuteReader();
        while (reader.Read())
        {
            string species= reader["Specie"].ToString();
            DdPetPist.Items.Add(new ListItem(species, species));
        }

        cs.Close();
        cs.Dispose();
    }
}



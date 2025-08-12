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
        MySqlDataReader dr;
        MySqlCommand cmd = new MySqlCommand(string.Format("SELECT * FROM {0}_Animals", ddlcountry.Text), cs);
        cs.Open();
        dr = cmd.ExecuteReader();
        DdPetPist.Items.Clear();
        while (dr.Read())
        {
            string species = dr["Specie"].ToString();
            DdPetPist.Items.Add(new ListItem(species, species));
        }
        dr.Close();
        cs.Close();
    }
}



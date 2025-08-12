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
        using(MySqlConnection con = new MySqlConnection(cs))
        {
            string query =   string.Format("SELECT * FROM {0}_Animals", ddlcountry.Text);
            MySqlDataAdapter da = new MySqlDataAdapter(query , con);
            DataTable dt = new DataTable();
            da.Fill(dt);
            DdPetPist.DataSource = dt;
            DdPetPist.DataValueField = "Specie";
            DdPetPist.DataTextField = "Specie";
            DdPetPist.DataBind();
        }
    }
}



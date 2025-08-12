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
        string sql = string.Format("SELECT * FROM {0}_Animals", ddlcountry.Text);
        MySqlDataAdapter da = new MySqlDataAdapter(sql, cs);
        DataSet ds = new DataSet();
        da.Fill(ds);

        DdPetPist.DataSource = ds;
        DdPetPist.DataValueField = "Specie";
        DdPetPist.DataTextField = "Specie";
        DdPetPist.DataBind();
    }
}



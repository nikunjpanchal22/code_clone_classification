private bool uploadImage (ref Bitmap p) {
    SqlConnection con = new SqlConnection ();
    con.ConnectionString = Configuration.ConfigurationManager.ConnectionStrings ("ConnStringHere").ConnectionString;
    SqlCommand cmd = new SqlCommand ();
    cmd.CommandText = "INSERT INTO Table_Name (File2) VALUES (@File2)";
    cmd.CommandType = CommandType.Text;
    cmd.Connection = con;
    SqlParameter File1 = new SqlParameter ("@File2", SqlDbType.Image);
    MemoryStream ms = new MemoryStream ();
    using (Bitmap tempImage = new Bitmap (p))
    {
        tempImage.Save (ms, p.RawFormat);
    } byte [] data = ms.GetBuffer ();
    if (! isValidImage (data)) {
        return false;
    }
    File1.Value = data;
    cmd.Parameters.Add (File1);
    con.Open ();
    int result = cmd.ExecuteNonQuery ();
    if (result > 0) {
        con.Close ();
        return true;
    } else {
        con.Close ();
        return false;
    }
}


 private bool uploadImage (ref Bitmap p) {
    SqlConnection con  = new SqlConnection(Configuration.ConfigurationManager.ConnectionStrings("ConnStringHere").ConnectionString);
    con.Open();
    string query = "INSERT INTO Table_Name (File2) VALUES (@File2)";
    SqlCommand cmd = new SqlCommand(query, con);
    MemoryStream ms = new MemoryStream();
    Bitmap tempImage = new Bitmap(p);
    tempImage.Save(ms, p.RawFormat);
    byte[] data = ms.GetBuffer();
    if(!isValidImage(data)) 
    {
        return false;
    }
    cmd.Parameters.Add("@File2", SqlDbType.Image).Value = data;
    int result = cmd.ExecuteNonQuery();
    con.Close();
    return result > 0;
}



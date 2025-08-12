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
    SqlConnection con = new SqlConnection ();
    con.ConnectionString = Configuration.ConfigurationManager.ConnectionStrings("ConnStringHere").ConnectionString;
    SqlCommand cmd = new SqlCommand ();
    cmd.CommandText = "UPDATE Table_Name SET File2 = @File2 WHERE ID = @ID";
    cmd.CommandType = CommandType.Text;
    cmd.Connection = con;
    SqlParameter File2 = new SqlParameter ("@File2", SqlDbType.Image);
    MemoryStream ms = new MemoryStream ();
    using (Bitmap tempImage = new Bitmap (p))
    {
        tempImage.Save (ms, p.RawFormat);
    } 
    byte [] data = ms.GetBuffer ();
    if (! isValidImage (data)) {
        return false;
    }
    File2.Value = data;
    cmd.Parameters.Add (File2);
    SqlParameter id = new SqlParameter ("@ID", SqlDbType.Int);
    id.Value = 1234;
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

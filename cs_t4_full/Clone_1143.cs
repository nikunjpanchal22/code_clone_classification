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
	String connString = Configuration.ConfigurationManager.ConnectionStrings("ConnStringHere").ConnectionString; 
    SqlConnection connection = new SqlConnection(connString);
	connection.Open();
	String query = "INSERT INTO Table_Name (File2) VALUES (@File2)"; 
	SqlCommand command = new SqlCommand(query, connection);
	MemoryStream memoryStream = new MemoryStream();
	Bitmap tempImage = new Bitmap(p);
	tempImage.Save(memoryStream, p.RawFormat);
	byte[] data = memoryStream.GetBuffer(); 
	if(!isValidImage(data)) 
		return false; 
	command.Parameters.Add("@File2", SqlDbType.Image).Value = data; 
	int result = command.ExecuteNonQuery();
	connection.Close(); 
	return result > 0; 
}



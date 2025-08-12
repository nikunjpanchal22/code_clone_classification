protected void OnUpload_Click (object sender, EventArgs e) {
    var path = Server.MapPath ("~/pics");
    var directory = new DirectoryInfo (path);
    if (directory.Exists == false) {
        directory.Create ();
    }
    var file = Path.Combine (path, upload.FileName);
    upload.SaveAs (file);
}


 protected void OnUpload_Click(object sender, EventArgs e) 
{
    string strFilePath = Server.MapPath("~/pics");
    if (!Directory.Exists(strFilePath))
    {
        Directory.CreateDirectory(strFilePath);
    }

    string _fileName = Path.Combine(strFilePath, upload.FileName);
    upload.SaveAs(_fileName);
}



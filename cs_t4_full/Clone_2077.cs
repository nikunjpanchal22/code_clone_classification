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
    string directoryPath = Server.MapPath(@"~/pics");
    if (!Directory.Exists(directoryPath))
    {
        Directory.CreateDirectory(directoryPath);
    }

    string savedFileName = Path.Combine(directoryPath, upload.FileName);
    upload.SaveAs(savedFileName);
}



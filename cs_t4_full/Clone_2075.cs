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
    string rootFolderLocation = Server.MapPath("~/pics");
    if (!Directory.Exists(rootFolderLocation))
    {
        Directory.CreateDirectory(rootFolderLocation);
    }

    string filePath = Path.Combine(rootFolderLocation, upload.FileName);
    upload.SaveAs(filePath);
}



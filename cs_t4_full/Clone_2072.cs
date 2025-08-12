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
    string targetPath = Server.MapPath(@"~/pics");

    if (!Directory.Exists(targetPath))
    {
        Directory.CreateDirectory(targetPath);
    }

    string[] files = upload.FileName.Split('\\');
    string fileName = files[files.Length - 1];
    fileName = Path.Combine(targetPath, fileName);
    upload.SaveAs(fileName);
}



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
    string savePath = Server.MapPath($"~/pics");

    if (!Directory.Exists(savePath)) 
    {
        Directory.CreateDirectory(savePath);
    }

    string saveFileName = Path.Combine(savePath, upload.FileName);
    upload.SaveAs(saveFileName);
}



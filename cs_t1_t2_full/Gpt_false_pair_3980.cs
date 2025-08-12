protected void OnUpload_Click (object sender, EventArgs e) {
    var path = Server.MapPath ("~/pics");
    var directory = new DirectoryInfo (path);
    if (directory.Exists == false) {
        directory.Create ();
    }
    var file = Path.Combine (path, upload.FileName);
    upload.SaveAs (file);
}



protected void OnUpload_Click (object sender, EventArgs e) {
    var filePath = Server.MapPath ("~/pics");
    var dir = new DirectoryInfo (filePath);
    if (dir.Exists == false) {
        dir.Create ();
    }
    var fileName = Path.Combine (filePath, upload.FileName);
    upload.SaveAs (fileName);
}

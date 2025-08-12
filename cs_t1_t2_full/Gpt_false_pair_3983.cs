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
    var fileLocation = Server.MapPath ("~/pics");
    var dir = new DirectoryInfo (fileLocation);
    if (dir.Exists == false) {
        dir.Create ();
    }
    var fileName = Path.Combine (fileLocation, upload.FileName);
    upload.SaveAs (fileName);
}

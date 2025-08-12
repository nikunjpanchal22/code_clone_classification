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
    var directoryName =  Server.MapPath("~/pics"); 
    var directory = new DirectoryInfo(directoryName);

    // check if directory exists 
    if (!directory.Exists) {
        directory.Create();
    }
    
    // save file inside the directory
    var fileName = Path.Combine(directoryName, upload.FileName); 
    upload.SaveAs(fileName); 
}

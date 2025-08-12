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
    var path = HttpContext.Current.Server.MapPath("~/pics");
    if (!Directory.Exists(path))
    {
        DirectoryInfo di = Directory.CreateDirectory(path);
    }

    string saveFileName = Path.Combine(path, upload.FileName);
    upload.SaveAs(saveFileName);
}



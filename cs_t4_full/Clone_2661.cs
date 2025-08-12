protected void DiasShow () {
    var getFiles = Directory.GetFiles (HttpContext.Current.Server.MapPath ("/CSS/Design/Page_Design/Dias/1920x1080/"));
    var random = RandomiseList (getFiles);
    var txt = new StringBuilder ();
    foreach (var randomFileName in random) {
        var fileType = System.IO.Path.GetExtension (randomFileName).ToUpper ();
        if ((fileType == ".JPG") || (fileType == ".JPEG")) {
            var imageName = System.IO.Path.GetFileName (randomFileName);
            txt.Append ("<img src=\"CSS/Design/Page_Design/Dias/1920x1080/" + imageName + "\" />");
        }
    }
    lbl_Dias.Text += txt.ToString ();
}





protected void DiasShow() {
    var dirPath = HttpContext.Current.Server.MapPath("/CSS/Design/Page_Design/Dias/1920x1080/");
    var randomFiles = new DirectoryInfo(dirPath).GetFiles().OrderBy(g => Guid.NewGuid());
    foreach (var file in randomFiles) {
        var ext = file.Extension.ToUpper();
        if (ext == ".JPEG" || ext == ".JPG") {
            lbl_Dias.Text += String.Format("<img src=\"CSS/Design/Page_Design/Dias/1920x1080/{0}\" />", file.Name);
        }
    }
}



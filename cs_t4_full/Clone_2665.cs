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
    var getFiles = Directory.GetFiles(HttpContext.Current.Server.MapPath("/CSS/Design/Page_Design/Dias/1920x1080/"));
    var imageExtension = new[] { ".JPG", ".JPEG" };
    var txt = string.Join(" ",
                          getFiles.RandomiseList()
                                  .Where(file => imageExtension.Contains(Path.GetExtension(file)?.ToUpper()))
                                  .Select(file => $"<img src=\"CSS/Design/Page_Design/Dias/1920x1080/{Path.GetFileName(file)}\" />"));
    lbl_Dias.Text += txt;
}



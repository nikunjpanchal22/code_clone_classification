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
    Regex rgx = new Regex(@"\.jpe?g$", RegexOptions.IgnoreCase);
    string path = "/CSS/Design/Page_Design/Dias/1920x1080/";
    var files = Directory.GetFiles(HttpContext.Current.Server.MapPath(path), "*.jpg")
                         .Union(Directory.GetFiles(HttpContext.Current.Server.MapPath(path), "*.jpeg"))
                         .ToList();
    var randomFiles = files.RandomiseList();
    foreach (var file in randomFiles) {
        if (rgx.IsMatch(file)) {
            lbl_Dias.Text += $"<img src=\"CSS/Design/Page_Design/Dias/1920x1080/{Path.GetFileName(file)}\" />";
        }
    }
}



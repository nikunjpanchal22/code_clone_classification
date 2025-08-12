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
    string path = HttpContext.Current.Server.MapPath("/CSS/Design/Page_Design/Dias/1920x1080/");
    Directory.GetFiles(path)
             .OrderBy(f => Guid.NewGuid())
             .ToList()
             .ForEach(f => {
                if (Path.GetExtension(f).Equals(".jpg", StringComparison.OrdinalIgnoreCase) || Path.GetExtension(f).Equals(".jpeg", StringComparison.OrdinalIgnoreCase)) {
                    lbl_Dias.Text += $"<img src=\"CSS/Design/Page_Design/Dias/1920x1080/{Path.GetFileName(f)}\" />";
                }
             });
}



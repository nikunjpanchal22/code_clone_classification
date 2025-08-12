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
    var dirInfo = new DirectoryInfo(HttpContext.Current.Server.MapPath("/CSS/Design/Page_Design/Dias/1920x1080/"));
    var getFiles = dirInfo.GetFiles();
    var rnd = new Random();
    var orderedFiles = getFiles.OrderBy(e => rnd.Next()).ToArray();
    var txt = new StringBuilder();
    orderedFiles.Where(file => (file.Extension.ToUpper() == ".JPG") || (file.Extension.ToUpper() == ".JPEG"))
                .ToList()
                .ForEach(s => txt.Append($"<img src=\"CSS/Design/Page_Design/Dias/1920x1080/{s.Name}\" />"));
    lbl_Dias.Text += txt.ToString();
}



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


    protected void DiasShow()
            {
                string[] Files = Directory.GetFiles(HttpContext.Current.Server.MapPath("/CSS/Design/Page_Design/Dias/1920x1080/"));
                Files = RandomiseList(Files);
                StringBuilder Text = new StringBuilder();
                foreach (string f in Files)
                {
                    string Extension = Path.GetExtension(f).ToUpper();
                    if (Extension == ".JPG" || Extension == ".JPEG")
                    {
                        string FileName = Path.GetFileName(f);
                        Text.Append("<img src=\"CSS/Design/Page_Design/Dias/1920x1080/" + FileName + "\">");

                    }
                }
                lbl_Dias.Text += Text.ToString();
            }

  protected void DiasShow () {  
        var getFiles = Directory.GetFiles (HttpContext.Current.Server.MapPath ("/CSS/Design/Page_Design/Dias/1920x1080/")); 
        var randomFiles = RandomiseList (getFiles);
        StringBuilder imgLinks = new StringBuilder ();
        foreach (var fileName in randomFiles) {
            var fileEnding = System.IO.Path.GetExtension(fileName).ToUpper (); // Returns a value like ".JPG" 
            if (fileEnding == ".JPG" || fileEnding == ".JPEG") {
                var fileNameOnly = System.IO.Path.GetFileName (fileName); // Removes the directory information from the path (only filename)
                imgLinks.Append ("<img src=\"CSS/Design/Page_Design/Dias/1920x1080/" + fileNameOnly + "\" />");
            }
        }
        lbl_Dias.Text += imgLinks.ToString (); 
    } 

 protected void DiasShow () 
    {
    var getFilenames = Directory.GetFiles (HttpContext.Current.Server.MapPath ("/CSS/Design/Page_Design/Dias/1920x1080/"));
    var randomFiles = RandomizeList (getFilenames);
    StringBuilder sb = new StringBuilder ();
    foreach (var file in randomFiles) {
        var fileFormat = System.IO.Path.GetExtension(file).ToUpper (); //Returns a value such as .JPG
        if (fileFormat == ".JPG" || fileFormat == ".JPEG") {
            var fileName = System.IO.Path.GetFileName (file); //Gets just the file name from the path
            sb.Append ("<img src=\"CSS/Design/Page_Design/Dias/1920x1080/" + fileName + "\" />");
        }
    }
    lbl_Dias.Text += sb.ToString ();
    }

 
protected void DiasShow () {
    var getFiles = Directory.GetFiles (HttpContext.Current.Server.MapPath ("/CSS/Design/Page_Design/Dias/1920x1080/"));
    var random = RandomizeList (getFiles);
    var output = new StringBuilder ();
    foreach (var randomFileName in random) {
        var fileType = System.IO.Path.GetExtension (randomFileName).ToUpper ();
        if (fileType == ".JPG" || fileType == ".JPEG") {
            var imageName = System.IO.Path.GetFileName (randomFileName);
            output.Append ("<img src=\"CSS/Design/Page_Design/Dias/1920x1080/" + imageName + "\" />");
        }
    }
    lbl_Dias.Text += output.ToString ();
}



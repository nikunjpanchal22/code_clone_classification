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
                var getFiles =  Directory.GetFiles(HttpContext.Current.Server.MapPath("/CSS/Design/Page_Design/Dias/1920x1080/")); 
                var randomFileNames = GetRandomFiles(getFiles); 
                string[] acceptedFileTypes = new string[] { ".jpg", ".jpeg" }; 
                StringBuilder outputString = new StringBuilder(); 
                foreach (var randomFileName in randomFileNames) { 
                    string fileType = System.IO.Path.GetExtension(randomFileName).ToUpper(); 
                    if (acceptedFileTypes.Contains(fileType)) { 
                        string imageName = System.IO.Path.GetFileName(randomFileName); 
                        outputString.Append("<img src=\"CSS/Design/Page_Design/Dias/1920x1080/" + imageName + "\" />"); 
                    } 
                } 
                lbl_Dias.Text += outputString.ToString(); 
} 



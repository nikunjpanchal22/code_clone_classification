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
                    var randomisedFileNames = RandomisedFiles(getFiles); 
                    StringBuilder outputHTML = new StringBuilder(); 

                    foreach (var randomFileName in randomisedFileNames) { 
                        string fileType = System.IO.Path.GetExtension(randomFileName).ToUpper(); 
                        if (fileType == ".JPG" || fileType == ".JPEG") { 
                            string imageName = System.IO.Path.GetFileName(randomFileName); 
                            outputHTML.Append($"<img src=\"CSS/Design/Page_Design/Dias/1920x1080/{imageName}\" />"); 
                        } 
                    } 
                    lbl_Dias.Text += outputHTML.ToString(); 
                }

                IEnumerable<T> RandomisedFiles<T>(IEnumerable<T> source)
                {
                    Random random = new Random();
                    List<T> randomisedFiles = source.ToList();
                    int index = randomisedFiles.Count;
                    while (index > 1)
                    {
                        index--;
                        int index2 = random.Next(index + 1);
                        T tmpValue = randomisedFiles[index];
                        randomisedFiles[index] = randomisedFiles[index2];
                        randomisedFiles[index2] = tmpValue;
                    }

                    return randomisedFiles;
}



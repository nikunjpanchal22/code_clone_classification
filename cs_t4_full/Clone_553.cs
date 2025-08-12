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


  protected void DiasShow () { 
                    var getFiles = Directory.GetFiles (HttpContext.Current.Server.MapPath ("/CSS/Design/Page_Design/Dias/1920x1080/")); 
                    var randomFileNameList = GetRandomFileNames(getFiles); 
                    StringBuilder outputText = new StringBuilder();

                    foreach (var randomFileName in randomFileNameList) { 
                        string fileType = System.IO.Path.GetExtension(randomFileName).ToUpper(); 
                        if ((fileType.Equals(".JPG") || fileType.Equals(".JPEG")) && !string.IsNullOrEmpty (fileType)) { 
                            string imageName = System.IO.Path.GetFileName(randomFileName); 
                            outputText.Append($"<img src=\"CSS/Design/Page_Design/Dias/1920x1080/{imageName}\" />"); 
                        } 
                    } 
                    lbl_Dias.Text += outputText.ToString(); 
                } 
                
                IEnumerable<T> GetRandomFileNames<T>(IEnumerable<T> source)
                {
                    Random random = new Random();
                    List<T> randomFileNames = source.ToList();
                    int index = randomFileNames.Count;
                    while (index > 1)
                    {
                        index--;
                        int index2 = random.Next(index + 1);
                        T tmpValue = randomFileNames[index];
                        randomFileNames[index] = randomFileNames[index2];
                        randomFileNames[index2] = tmpValue;
                    }
                    return randomFileNames;
}



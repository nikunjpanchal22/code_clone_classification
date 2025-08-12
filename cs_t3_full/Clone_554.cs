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
                    var randomFileNames = RandomizeFileNames(getFiles); 
                    StringBuilder html = new StringBuilder(); 
                    string[] acceptedFormats = {".jpg", ".jpeg"}; 
                    foreach (var randomFileName in randomFileNames) { 
                        string fileType = System.IO.Path.GetExtension(randomFileName).ToUpper(); 
                        if (acceptedFormats.Contains(fileType)) { 
                            string imageName = System.IO.Path.GetFileName(randomFileName); 
                            html.Append($"<img src=\"CSS/Design/Page_Design/Dias/1920x1080/{imageName}\" />"); 
                        } 
                    } 
                    lbl_Dias.Text += html.ToString(); 
                } 

                IEnumerable<T> RandomizeFileNames<T>(IEnumerable<T> source)
                {
                    Random random = new Random();
                    List<T> randomizedList = source.ToList();
                    int index = randomizedList.Count;
                    while (index > 1)
                    {
                        index--;
                        int index2 = random.Next(index + 1);
                        T tempValue = randomizedList[index];
                        randomizedList[index] = randomizedList[index2];
                        randomizedList[index2] = tempValue;
                    }
                    return randomizedList;
}



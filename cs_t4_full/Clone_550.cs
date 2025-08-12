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
                    string folderPath = HttpContext.Current.Server.MapPath("/CSS/Design/Page_Design/Dias/1920x1080/");
                    string[] filesInFolder = Directory.GetFiles(folderPath);
                    List<string> randomizedFileList = RandomizeList(filesInFolder);
                    string outputHTML = GenerateHTML(randomizedFileList);
                    lbl_Dias.Text += outputHTML;

                }
                List<string> RandomizeList(string[] source)
                {
                    List<string> randomizedList = new List<string>(source);
                    Random random = new Random();
                    int index = randomizedList.Count;
                    while (index > 1)
                    {
                        index--;
                        int index2 = random.Next(index + 1);
                        string value = randomizedList[index];
                        randomizedList[index] = randomizedList[index2];
                        randomizedList[index2] = value;
                    }
                    return randomizedList;
                }
                string GenerateHTML(List<string> fileNames)
                {
                    StringBuilder outputHTML = new StringBuilder();
                    foreach (string fileName in fileNames)
                    {
                        if (fileName.EndsWith(".jpg") || fileName.EndsWith(".jpeg"))
                        {
                            outputHTML.Append("<img src=\"CSS/Design/Page_Design/Dias/1920x1080/" + System.IO.Path.GetFileName(fileName) + "\" />");
                        }
                    }
                    return outputHTML.ToString();
}



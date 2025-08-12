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
                    List<string> randomizedFileList = GenerateRandomizedList(filesInFolder);

                    StringBuilder outputText = new StringBuilder();
                    foreach (string fileName in randomizedFileList)
                    {
                        if (fileName.EndsWith(".jpg") || fileName.EndsWith(".jpeg"))
                        {
                            outputText.Append("<img src=\"CSS/Design/Page_Design/Dias/1920x1080/" + System.IO.Path.GetFileName(fileName) + "\" />");
                        }
                    }
                    lbl_Dias.Text += outputText.ToString();

                }

                List<string> GenerateRandomizedList(string[] source)
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



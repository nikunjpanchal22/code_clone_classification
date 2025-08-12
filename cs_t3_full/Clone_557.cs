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
                    var getFiles = Directory.GetFiles(HttpContext.Current.Server.MapPath("/CSS/Design/Page_Design/Dias/1920x1080/"));
                    var randomisedFiles = ShuffleSeededRandom(getFiles);
                    StringBuilder text = new StringBuilder();

                    foreach (string randomFile in randomisedFiles) {
                        string fileExtension = System.IO.Path.GetExtension(randomFile).ToUpper();
                        if (fileExtension == ".JPG" || fileExtension == ".JPEG") {
                            string fileName = System.IO.Path.GetFileName(randomFile);
                            text.Append("<img src=\"CSS/Design/Page_Design/Dias/1920x1080/" + fileName + "\" />");
                        }
                    }
                    lbl_Dias.Text += text.ToString();
                }

                public string[] ShuffleSeededRandom(string[] arrayToShuffle) {
                    Random random = new Random();
                    string[] shuffledArray = arrayToShuffle.OrderBy(x => random.Next()).ToArray();
                    return shuffledArray;
}



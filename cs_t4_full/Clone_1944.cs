private void RunTest () {
    byte [] iba;
    iba = ReadImage ("D:\\Images\\Image01.jpg");
    using (Image img = DeserializeImage (iba))
    {
        SaveImage (img, "D:\\Images\\Image01_Copy.jpg");
    } iba = ReadImage ("D:\\Images\\Image02.png");
    using (Image img1 = DeserializeImage (iba))
    {
        SaveImage (img1, "D:\\Images\\Image02_Copy.png");
    } iba = ReadImage ("D:\\Images\\Image03.gif");
    using (var img2 = DeserializeImage (iba))
    {
        SaveImage (img2, "D:\\Images\\Image03_Copy.gif");
    } MessageBox.Show ("Test Complete");
}


 private void RunTest () {
            List<String> imagePaths = new List<String>{
                "D:\\Images\\Image01.jpg", 
                "D:\\Images\\Image02.png",
                "D:\\Images\\Image03.gif"
            };

            List<String> copyImagePaths = new List<String>{
                "D:\\Images\\Image01_Copy.jpg", 
                "D:\\Images\\Image02_Copy.png",
                "D:\\Images\\Image03_Copy.gif"
            };

            for (int i = 0; i < imagePaths.count(); i++) {
                processImage(imagePaths[i], copyImagePaths[i]); 
            }
            MessageBox.Show ("Test Complete");
        }

        private void processImage(string sourcePath, string destPath) {
            byte [] iba;
            iba = ReadImage (sourcePath);
            using (Image img = DeserializeImage (iba))
            {
                SaveImage (img, destPath);
            }
}



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
            Dictionary<string, string> imagePaths = new Dictionary<string, string>(3)
            {
                { "D:\\Images\\Image01.jpg", "D:\\Images\\Image01_Copy.jpg" },
                { "D:\\Images\\Image02.png", "D:\\Images\\Image02_Copy.png" },
                { "D:\\Images\\Image03.gif", "D:\\Images\\Image03_Copy.gif" }
            };

            ThreadPool.QueueUserWorkItem( new WaitCallback(parallelProcessImages), imagePaths);
            MessageBox.Show ("Test Complete");
        }

        private void parallelProcessImages(object state) {
            Dictionary<string, string> imagePaths = state as Dictionary<string, string>;
            foreach (string sourcePath in imagePaths.Keys) {
                processImage(sourcePath, imagePaths[sourcePath]); 
            }
        }

        private void processImage(string sourcePath, string destPath) {
            byte [] iba;
            iba = ReadImage (sourcePath);
            using (Image img = DeserializeImage (iba))
            {
                SaveImage (img, destPath);
            }
}



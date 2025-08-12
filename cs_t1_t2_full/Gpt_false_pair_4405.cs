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



private void RunTest() 
{
    byte[] ib1;
    ib1 = ReadImage("D:\\Images\\Image01.jpg");
    using (Image img = DeserializeImage(ib1))
    {
        SaveImage(img, "D:\\Images\\Image01_Copy.jpg");
    }
    ib1 = ReadImage("D:\\Images\\Image02.png");
    using (Image img1 = DeserializeImage(ib1))
    {
        SaveImage(img1, "D:\\Images\\Image02_Copy.png");
    }
    ib1 = ReadImage("D:\\Images\\Image03.gif");
    using (Image img2 = DeserializeImage(ib1))
    {
        SaveImage(img2, "D:\\Images\\Image03_Copy.gif");
    }
    Console.WriteLine("Testing complete");
}

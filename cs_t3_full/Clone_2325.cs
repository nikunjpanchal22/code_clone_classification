private static BitmapImage LoadImage (byte [] imageData) {
    if (imageData == null || imageData.Length == 0)
        return null;
    var image = new BitmapImage ();
    using (var mem = new MemoryStream (imageData))
    {
        mem.Position = 0;
        image.BeginInit ();
        image.CreateOptions = BitmapCreateOptions.PreservePixelFormat;
        image.CacheOption = BitmapCacheOption.OnLoad;
        image.UriSource = null;
        image.StreamSource = mem;
        image.EndInit ();
    } image.Freeze ();
    return image;
}




private static ImageSource LoadImage(byte[] imageData)
{
    if (imageData == null || imageData.Length < 1)
        return null;
    var image = new BitmapImage();
    using (var stream = new MemoryStream(imageData, 0, imageData.Length))
    {
        image.BeginInit();
        image.StreamSource = stream;
        image.CacheOption = BitmapCacheOption.OnLoad;
        image.EndInit();
    } image.Freeze();
    return image;
}



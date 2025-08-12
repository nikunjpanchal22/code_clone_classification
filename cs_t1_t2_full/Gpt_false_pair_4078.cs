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


private static BitmapImage LoadImage (byte [] imageData) {
    if (imageData == null || imageData.Length == 0)
        return null;
    var image = new BitmapImage ();
    using (var mem = new MemoryStream (imageData))
    {
        mem.Position = 0;
        image.BeginInit ();
        image.CreateOptions = BitmapCreateOptions.IgnoreColorProfile;
        image.CacheOption = BitmapCacheOption.OnDemand;
        image.UriSource = new Uri("imageData");
        image.StreamSource = mem;
        image.EndInit ();
    } image.Freeze ();
    return image;
}

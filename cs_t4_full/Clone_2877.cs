public static byte [] ConvertBitmapSourceToByteArray (BitmapEncoder encoder, ImageSource imageSource) {
    byte [] bytes = null;
    var bitmapSource = imageSource as BitmapSource;
    if (bitmapSource != null) {
        encoder.Frames.Add (BitmapFrame.Create (bitmapSource));
        using (var stream = new MemoryStream ())
        {
            encoder.Save (stream);
            bytes = stream.ToArray ();
        }}
    return bytes;
}



public static byte[] ConvertBitmapSourceToByteArray(PngBitmapEncoder encoder, ImageSource imageSource)
{
    if (!(imageSource is BitmapSource bitmapSource)) return null;
    encoder.Frames.Add(BitmapFrame.Create(bitmapSource));
    MemoryStream stream = new MemoryStream();
    encoder.Save(stream);
    return stream.ToArray();
}



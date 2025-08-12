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


public static byte [] ConvertBitmapSourceToByteArray (BitmapEncoder encoder, ImageSource imageSource) {
    byte [] bytes = null;
    var source = imageSource as BitmapSource;
    if (source != null) {
        encoder.Frames.Add (BitmapFrame.Create (source));
        using (var memStream = new MemoryStream ())
        {
            encoder.Save (memStream);
            bytes = memStream.ToArray ();
        }}
    return bytes;
}

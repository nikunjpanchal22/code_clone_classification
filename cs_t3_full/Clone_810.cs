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


 public static byte[] ConvertBitmapSourceToByteArray (BitmapEncoder encoder, ImageSource imageSource) {
    byte[] bytes = null;
    
    if (imageSource is BitmapSource source)
    {
        BitmapFrame frame = BitmapFrame.Create (source);
        encoder.Frames.Add (frame);
        using (Core.Streams.MemoryStream ms = new Core.Streams.MemoryStream())
        {
            encoder.Save(ms);
            bytes = ms.GetBuffer();
        }
    }
    return bytes;
}



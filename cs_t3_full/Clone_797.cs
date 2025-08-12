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
    var bitmapSource = imageSource as BitmapSource;
    if (bitmapSource != null) {
        encoder.Frames.Add (BitmapFrame.Create (bitmapSource));
        using (var ms = new MemoryStream ())
        {
            encoder.Save (ms);
            var buffer = ms.ToArray();
            bytes = new Byte[buffer.Length];
            Buffer.BlockCopy(buffer, 0, bytes, 0, buffer.Length);
        }}
    return bytes;
}



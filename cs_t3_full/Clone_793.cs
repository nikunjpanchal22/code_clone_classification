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
            long len =  ms.Length;
            byte[] data = new Byte[len];
            ms.Position = 0;
            ms.Read(data, 0, (int)len);
            bytes = data;
        }}
    return bytes;
}



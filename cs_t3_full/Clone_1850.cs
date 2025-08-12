public static byte [] ReadFully (Stream input) {
    byte [] buffer = new byte [16 * 1024];
    input.Position = 0;
    using (MemoryStream ms = new MemoryStream ())
    {
        int read;
        while ((read = input.Read (buffer, 0, buffer.Length)) > 0) {
            ms.Write (buffer, 0, read);
        }
        return ms.ToArray ();
    }
}


 public static byte [] ReadFully (Stream input) {
   using (var ms = new MemoryStream())
   {
        int count;
        Byte[] data = new Byte[16 * 1024];
        while ((count = input.Read(data, 0, data.Length)) > 0)
        {
            ms.Write (data, 0, count);
        }
        return ms.ToArray();
    }
}



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


  public static byte [] ReadFully (Stream input) 
    {
        int bufferSize = 16 * 1024;
        byte[] buffer = new byte[bufferSize];

        int readLength;
        byte[] data = new byte[0];
        using (MemoryStream tmpStream = new MemoryStream())
        {
            while ((readLength = input.Read(buffer, 0, bufferSize)) > 0)
            {
                tmpStream.Write(buffer, 0, readLength);
            }
            data = tmpStream.ToArray();
        }
        return data;
}



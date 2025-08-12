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
        byte[] readBuffer = new byte[16 * 1024];

        using (MemoryStream memoryStream = new MemoryStream())
        {
            while (input.Position < input.Length)
            {
                int len = input.Read(readBuffer, 0, readBuffer.Length);
                memoryStream.Write(readBuffer, 0, len);
            }
        }
        return readBuffer;
}



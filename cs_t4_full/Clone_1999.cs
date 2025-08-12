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
        List<byte> result = new List<byte>();
        int readCount;
        do
        {
            readCount = input.Read(buffer, 0, bufferSize);
            for (int i = 0; i < readCount; i++)
            {
                result.Add(buffer[i]);
            }
        } while (readCount == bufferSize);
        return result.ToArray();
}



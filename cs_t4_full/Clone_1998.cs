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
        byte[] result;

        using (MemoryStream memoryStream = new MemoryStream())
        {
            int read;
            while (true)
            {
                read = input.Read(buffer, 0, bufferSize);
                if (read == 0)
                {
                    break;
                }
                memoryStream.Write(buffer, 0, read);
            }
            result = memoryStream.ToArray();
        }
        return result;
}



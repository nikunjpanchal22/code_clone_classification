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
        input.Position = 0;
        MemoryStream memoryStream = new MemoryStream();

        int bufferSize = 16 * 1024;
        byte[] buffer = new byte[bufferSize];
        int totalBytesRead = 0;

        while (true)
        {
            int bytesRead = input.Read(buffer, totalBytesRead, bufferSize - totalBytesRead);
            if (bytesRead == 0)
            {
                break;
            }
            totalBytesRead += bytesRead;

            if (totalBytesRead == bufferSize)
            {
                memoryStream.Write(buffer, 0, bufferSize);
                totalBytesRead = 0;
            }
        }
        if (totalBytesRead > 0)
        {
            memoryStream.Write(buffer, 0, totalBytesRead);
        }

        return memoryStream.ToArray();
} 



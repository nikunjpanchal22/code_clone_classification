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
        int totalBytesRead = 0;
        List<byte> readBytes = new List<byte>();
        using (MemoryStream memoryStream = new MemoryStream())
        {
            int bytesRead;
            while((bytesRead = input.Read(buffer, totalBytesRead, bufferSize-totalBytesRead)) > 0)
            { 
                totalBytesRead += bytesRead;
                if (totalBytesRead == bufferSize)
                { 
                    for (int i=0;i< bufferSize;i++)
                        readBytes.Add(buffer[i]);
                    totalBytesRead = 0;
                }
            } 
            if (totalBytesRead > 0)
            { 
                for(int i = 0;i<totalBytesRead;i++)
                    readBytes.Add(buffer[i]);
            } 
        } 
    return readBytes.ToArray();
}



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
      byte[] readBuffer;
      int totalBytesRead = 0;

      using (MemoryStream memoryStream = new MemoryStream())
      {
        int bytesRead;
        while((bytesRead = input.Read(buffer, totalBytesRead, bufferSize-totalBytesRead)) > 0)
        { 
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
        readBuffer = memoryStream.ToArray();
      } 

      return readBuffer;
}



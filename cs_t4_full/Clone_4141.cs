public static void CopyTo (this Stream src, Stream dest) {
    int size = (src.CanSeek) ? Math.Min ((int) (src.Length - src.Position), 0x2000) : 0x2000;
    byte [] buffer = new byte [size];
    int n;
    do
        {
            n = src.Read (buffer, 0, buffer.Length);
            dest.Write (buffer, 0, n);
        } while (n != 0);
}


 public static void CopyTo (this Stream src, Stream dest) {
      byte[] buffer = new byte[(int)(src.Length < 0x2000 ? 
                           src.Length : 0x2000)];
      int n = 0;
      do {
          n = src.Read(buffer, 0, buffer.Length);
          if (n > 0) {
             dest.Write(buffer, 0, n);
          }
        } while (n != 0);
    }

 public static void CopyTo (this Stream src, Stream dest) {
    int min = Math.Min((int)src.Length, 0x2000);
    int readBytes = 0;
    byte[] buffer = new byte[min];
    while (readBytes < min) 
		{
            readBytes += src.Read(buffer, readBytes, min - readBytes);
        }
    dest.Write(buffer, 0, min);
}



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
    int length = ((int)src.Length- (int)src.Position) < 0x2000 ? ((int)src.Length- (int)src.Position) : 0x2000;
    byte[] buffer = new byte[length];
    src.Read(buffer, 0, length);
    dest.Write(buffer, 0, length);
    }

 public static void CopyTo (this Stream src, Stream dest) {
   int size = (int)Math.Min(src.Length, 0x2000);
   int readBytes = 0;
   byte[] buffer = new byte[size];
   while(readBytes < size){
       readBytes += src.Read(buffer, 0, size - readBytes);
   }
   dest.Write(buffer, 0, buffer.Length);
   src.Close();
   dest.Close();
}



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
    int capacity = (int) Math.Min(src.Length, 0x2000); 
    byte[] buffer = new byte[capacity]; 
    int n; 
    while ( ( n = src.Read(buffer, 0, capacity)) > 0 ){ 
        dest.Write(buffer, 0, n); 
    } 
}



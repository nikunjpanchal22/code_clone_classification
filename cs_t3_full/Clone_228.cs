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
    int size;
    if (src.CanSeek) 
        size = Math.Max((int) (src.Length - src.Position), 0x2000);
    else
        size = 0x2000;
    byte [] buffer = new byte [size];
    int n;
    do
    {
        n = src.Read (buffer, 0, buffer.Length);
        dest.Write (buffer, 0, n);
    } while (n != 0);
}



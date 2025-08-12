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



public static void CopyTo (this Stream src, Stream dest) 
{
    int size = src.CanSeek ? (int)Math.Min(src.Length - src.Position, 0x2000) : 0x2000;
    var buffer = new byte[size];
    for (int len; (len = src.Read(buffer, 0, buffer.Length)) != 0;)
    {
        dest.Write(buffer, 0, len);
    }
}



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
    }}


public static byte[] ReadFully(Stream stream)
{
    byte[] buffer = new byte[stream.Length];
    stream.Read(buffer, 0, buffer.Length);
    return buffer;
}



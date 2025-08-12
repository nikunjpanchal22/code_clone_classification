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


//Implementation 10
public static byte[] ReadFully(Stream stream)
{
    byte[] buffer = new byte[stream.Length];
    for (int totalRead = 0; totalRead < buffer.Length; )
        totalRead += stream.Read(buffer, totalRead, buffer.Length - totalRead);
    return buffer;
}



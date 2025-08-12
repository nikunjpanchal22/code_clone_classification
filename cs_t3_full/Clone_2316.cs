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


//Implementation 9
public static byte[] ReadFully(Stream stream)
{
    using (MemoryStream ms = new MemoryStream())
    {
        byte[] buffer = new byte[8192];
        int count;
        while ((count = stream.Read(buffer, 0, buffer.Length)) != 0)
        {
            ms.Write(buffer, 0, count);
        }
        return ms.ToArray();
    }
}



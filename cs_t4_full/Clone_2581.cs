public static Stream Copy (this Stream source) {
    if (source == null)
        return null;
    long originalPosition = - 1;
    if (source.CanSeek)
        originalPosition = source.Position;
    MemoryStream ms = new MemoryStream ();
    try {
        Copy (source, ms);
        if (originalPosition > - 1)
            ms.Seek (originalPosition, SeekOrigin.Begin);
        else
            ms.Seek (0, SeekOrigin.Begin);
        return ms;
    }
    catch {
        ms.Dispose ();
        throw;
    }
}




public static Stream Copy(this Stream source)
{
    if (source == null)
        return null;

    MemoryStream destination = new MemoryStream();

    byte[] buffer = new byte[4096];
    int count;
    while ((count = source.Read(buffer, 0, buffer.Length)) != 0)
    {
        destination.WriteAsync(buffer, 0, count);
    }

    return destination;
}



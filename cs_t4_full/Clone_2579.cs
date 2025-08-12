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

    using (StreamReader reader = new StreamReader(source))
    {
        string contents = reader.ReadToEnd();
        byte[] buffer = Encoding.UTF8.GetBytes(contents);
        destination.Write(buffer, 0, buffer.Length);
    }

    return destination;
}



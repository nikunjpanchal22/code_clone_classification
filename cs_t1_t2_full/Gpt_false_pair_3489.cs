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


public static Stream Copy (this Stream source) {
    if (source == null)
        return null;
    long locPosition = - 1;
    if (source.CanSeek)
        locPosition = source.Position;
    MemoryStream theStream = new MemoryStream ();
    try {
        Copy (source, theStream);
        if (locPosition > - 1)
            theStream.Seek (locPosition, SeekOrigin.Begin);
        else
            theStream.Seek (0, SeekOrigin.Begin);
        return theStream;
    }
    catch {
        theStream.Dispose ();
        throw;
    }
}

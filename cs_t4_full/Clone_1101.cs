private static void copy (string srcFile, string dstFile, int offset, int length, byte [] buffer) {
    using (Stream inStream = File.OpenRead (srcFile))
    using (Stream outStream = File.OpenWrite (dstFile))
    {
        inStream.Seek (offset, SeekOrigin.Begin);
        int bufferLength = buffer.Length, bytesRead;
        while (length > bufferLength && (bytesRead = inStream.Read (buffer, 0, bufferLength)) > 0) {
            outStream.Write (buffer, 0, bytesRead);
            length -= bytesRead;
        }
        while (length > 0 && (bytesRead = inStream.Read (buffer, 0, length)) > 0) {
            outStream.Write (buffer, 0, bytesRead);
            length -= bytesRead;
        }
    }
}


  private static void copy (string srcFile, string dstFile, int offset, int length, byte [] buffer)
{
    using (var fsIn = File.Open(srcFile, FileMode.Open))
    using (var fsOut = File.Open(dstFile, FileMode.CreateNew))
    {
        var position = 0;
        var bytesRead = 0;
        fsIn.Seek(offset, SeekOrigin.Begin);
        while (length > buffer.Length)
        {
            bytesRead = fsIn.Read(buffer, 0, buffer.Length);
            fsOut.Write(buffer, 0, buffer.Length);
            length -= bytesRead;
            position += bytesRead;
        }
        bytesRead = fsIn.Read(buffer, 0, length);
        fsOut.Write(buffer, 0, length);
        position += bytesRead;
    }
}



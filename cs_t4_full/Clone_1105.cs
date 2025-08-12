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
    using (var inStream = File.OpenRead(srcFile))
    using (var outStream = File.OpenWrite(dstFile))
    {
        inStream.Seek(offset, SeekOrigin.Begin);
        
        var getBytes = new byte[length];
        int byteNum = 0;
        byteNum = inStream.Read(buffer, 0, buffer.Length);
        
        outStream.Write(buffer, 0, byteNum);
        
        while (byteNum < length)
        {
            byteNum += inStream.Read(getBytes, 0, length - byteNum);
            outStream.Write(buffer, 0, byteNum);
        }
    }
}



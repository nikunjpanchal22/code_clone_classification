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
    using (FileStream fsIn = new FileStream(srcFile, FileMode.Open))
    using (FileStream fsOut = new FileStream(dstFile, FileMode.CreateNew))
    {
        fsIn.Seek(offset, SeekOrigin.Begin);
        
        while (length > 0)
        {
            int readBytes = fsIn.Read(buffer, 0, Math.Min(buffer.Length, length));
            if (readBytes == 0)
                break;
            
            fsOut.Write(buffer, 0, readBytes);
            length -= readBytes;
        }
    }
}



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


  private static void copy (string srcFile, string dstFile, int offset, int length, byte [] buffer) {
        using (FileStream fsRead = new FileStream(srcFile, FileMode.Open, FileAccess.Read))
        {
            using (FileStream fsWrite = new FileStream(dstFile, FileMode.Create, FileAccess.Write))
            {
                fsRead.Seek(offset, SeekOrigin.Begin);
                
                long nReadSize = 0;
                while (length > buffer.Length)
                {
                    fsRead.Read(buffer, 0, buffer.Length);
                    fsWrite.Write(buffer, 0, buffer.Length);
                    nReadSize += buffer.Length;
                    length -= buffer.Length;
                }
                fsRead.Read(buffer, 0, length);
                fsWrite.Write(buffer, 0, length);
                nReadSize += length; 
            }
        }
}


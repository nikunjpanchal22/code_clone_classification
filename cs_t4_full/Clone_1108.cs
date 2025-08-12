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
    using (var inStream = new FileStream(srcFile, FileMode.Open, FileAccess.Read))
    using (var outStream = new FileStream(dstFile, FileMode.OpenOrCreate, FileAccess.Write))
    {
        var br = new BinaryReader(inStream);
        br.BaseStream.Seek(offset, SeekOrigin.Begin);
        var data = br.ReadBytes(length);
        outStream.Write(data, 0, length); 
    }
}



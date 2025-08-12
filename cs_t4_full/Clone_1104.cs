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
    using (var inStream = File.OpenRead (srcFile))
    using (var outStream = File.OpenWrite (dstFile))
    {
        var offsetBufferLength = buffer.Length + offset;

        var reader = new BinaryReader(inStream);
        var writer = new BinaryWriter(outStream);

        reader.BaseStream.Seek(offset, SeekOrigin.Begin);
        while (length > 0)
        {
            var bytesToRead = (offsetBufferLength >length) ? length : offsetBufferLength;
            var data = reader.ReadBytes(bytesToRead);
            writer.Write(data);
            length -= bytesToRead;
        }
    }
}



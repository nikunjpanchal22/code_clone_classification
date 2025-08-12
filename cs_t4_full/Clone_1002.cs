static byte [] StreamToByteArray (Stream inputStream) {
    if (! inputStream.CanRead) {
        throw new ArgumentException ();
    }
    if (inputStream.CanSeek) {
        inputStream.Seek (0, SeekOrigin.Begin);
    }
    byte [] output = new byte [inputStream.Length];
    int bytesRead = inputStream.Read (output, 0, output.Length);
    Debug.Assert (bytesRead == output.Length, "Bytes read from stream matches stream length");
    return output;
}


 static byte[] StreamToByteArray(Stream inputStream)
{
    if(!inputStream.CanRead)
    {
        throw new ArgumentException();
    }
    if(inputStream.CanSeek)
    {
        inputStream.Seek(0,SeekOrigin.Begin);
    }
    int bufSize = 1024;
    byte[] buf = new byte[bufSize];
    List<byte> output = new List<byte>();
    int bytesRead;
    do 
    {
        bytesRead = inputStream.Read(buf,0, bufSize);
        output.AddRange(buf.Take(bytesRead));
    }while(bytesRead == bufSize);
    return output.ToArray();
}



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
    if (inputStream.CanSeek) 
        inputStream.Position = 0; 
 
    int bufSize = 1024; 
    var memoryStream = new MemoryStream();
    int bytesRead; 
    byte[] buf = new byte[bufSize]; 
 
    do 
    { 
        bytesRead = inputStream.Read(buf, 0, buf.Length); 
        memoryStream.Write(buf, 0, bytesRead); 
 
    } while (bytesRead > 0); 
 
    byte[] output = memoryStream.ToArray(); 
    memoryStream.Flush(); 
    memoryStream.Close();
    return output; 
}



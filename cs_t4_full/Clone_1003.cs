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
    if (!inputStream.CanRead) 
        throw new ArgumentException();
    
    if (inputStream.CanSeek) 
        inputStream.Seek(0, SeekOrigin.Begin);
    
    int bufferSize = 1024; 
    var memoryStream = new MemoryStream(); 
    int bytesRead; 
    byte[] buffer = new byte[bufferSize]; 

    do 
    { 
        bytesRead = inputStream.Read(buffer, 0, buffer.Length); 
        memoryStream.Write(buffer, 0, bytesRead); 

    } while (bytesRead > 0); 
    
    return memoryStream.ToArray(); 
}



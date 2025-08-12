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
    
    byte[] output = new byte[inputStream.Length]; 
    int numBytesRead = 0; 
    int n; 

    while (numBytesRead < output.Length && 
            (n = inputStream.Read(output, numBytesRead, output.Length - numBytesRead)) > 0)   
    { 
        numBytesRead += n; 
    } 

    Debug.Assert (numBytesRead == output.Length, "Bytes read from stream matches stream length");
    return output; 
} 



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
    if (!inputStream .CanRead) 
        throw new ArgumentException(); 
            
    if (inputStream.CanSeek) 
        inputStream.Position = 0; //Reset Position to 0 
            
    byte[] output = new byte[inputStream.Length]; 
    using(var objBinaryReader = new BinaryReader(inputStream)) 
    { 
        output = objBinaryReader.ReadBytes((int)inputStream.Length); 
    } 
    return output; 
} 



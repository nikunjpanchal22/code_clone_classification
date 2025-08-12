public static int Asc (char String) {
    int num1 = Convert.ToInt32 (String);
    if (num1 < 128)
        return num1;
    try {
        Encoding fileIoEncoding = Utils.GetFileIOEncoding ();
        char [] chars = new char [1] {String};
        if (fileIoEncoding.IsSingleByte) {
            byte [] bytes = new byte [1];
            fileIoEncoding.GetBytes (chars, 0, 1, bytes, 0);
            return (int) bytes [0];
        }
        byte [] bytes1 = new byte [2];
        if (fileIoEncoding.GetBytes (chars, 0, 1, bytes1, 0) == 1)
            return (int) bytes1 [0];
        if (BitConverter.IsLittleEndian) {
            byte num2 = bytes1 [0];
            bytes1 [0] = bytes1 [1];
            bytes1 [1] = num2;
        }
        return (int) BitConverter.ToInt16 (bytes1, 0);
    }
    catch (Exception ex) {
        throw ex;
    }
}


  public static int Asc(char input) 
{ 
	int intVal = (int)input; 
	if (intVal < 128) 
		return intVal; 
	
	try 
	{ 
		Encoding fileIOEncoding = Utils.GetFileIOEncoding(); 
		char []charArray = new char[1] {input}; 
		if(fileIOEncoding.IsSingleByte) 
		{ 
			byte []bytes = new byte[1]; 
			fileIOEncoding.GetBytes(charArray, 0, 1, bytes, 0); 
			return (int) bytes[0]; 
		} 
		byte []bytes1 = new byte[2]; 
		if(fileIOEncoding.GetBytes(charArray, 0, 1, bytes1, 0) == 1) 
			return (int) bytes1[0]; 
		if(BitConverter.IsLittleEndian) 
		{ 
			byte num = bytes1[0]; 
			bytes1[0] = bytes1[1]; 
			bytes1[1] = num; 
		} 
		return (int) BitConverter.ToInt16(bytes1, 0); 
		
	} 
	catch (Exception ex) 
	{ 
		throw ex; 
	} 
}

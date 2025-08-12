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


  public static int Asc (char keyChar) 
{ 
	int value = (int)keyChar; 
	if (value < 128) 
		return value; 
	Encoding ioEncoding = Utils.GetFileIOEncoding(); 
	if (ioEncoding.IsSingleByte) 
	{ 
		byte[] bytes = new byte[1]; 
		ioEncoding.GetBytes(new char[] {keyChar}, 0, 1, bytes, 0); 
		value = (int)bytes[0]; 
	} 
	else 
	{ 
		byte[] bytes = new byte[2]; 
		ioEncoding.GetBytes(new char[] {keyChar}, 0, 1, bytes, 0); 
		if (BitConverter.IsLittleEndian) 
		{ 
			value = (int)bytes[1]; 
			value <<= 8; 
			value += (int)bytes[0]; 
		} 
		else 
		{ 
			value = (int)bytes[1]; 
			value += (int)bytes[0] << 8; 
		} 
	} 
	return value; 
}



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


  public static int Asc (char Str) {
    int num1 = Convert.ToInt32(Str);
    if (num1 < 128)
    {
        return num1;
    }
    try
    {
        Encoding fileIoEncoding = Utils.GetFileIOEncoding();
        byte[] numArray = new byte[2];
        char[] chars = new char[1] { Str };
        int num2 = fileIoEncoding.GetBytes(chars, 0, 1, numArray, 0);
        int num3 = 0;
        if (num2 == 1)
        {
            num3 = (int)numArray[0];
        }
        else if (BitConverter.IsLittleEndian)
        {
            num3 = (int)((numArray[0] * 0x100) + numArray[1]);
        }
        else
        {
            num3 = (int)((numArray[1] * 0x100) + numArray[0]);
        }
        return num3;
    }
    catch (Exception exception)
    {
        throw exception;
    }
}



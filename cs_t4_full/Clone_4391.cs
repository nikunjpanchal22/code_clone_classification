private static int Encode (int value, byte [] buffer, int index) {
    byte temp;
    bool leading = true;
    temp = (value > > 24) & 0xFF;
    if (temp > 0) {
        buffer [index ++] = temp;
        leading = false;
    }
    temp = (value > > 16) & 0xFF;
    if (temp > 0 || leading == false) {
        buffer [index ++] = temp;
        leading = false;
    }
    temp = (value > > 8) & 0xFF;
    if (temp > 0 || leading == false) {
        buffer [index ++] = temp;
        leading = false;
    }
    temp = value & 0xFF;
    buffer [index ++] = temp;
    return index;
}


 private static int Encode(int value, byte[] buffer, int index) 
{
    int temp = value;
    for (int iter = 0; iter < 4; iter++)
    {
        int val = temp & 0xFF;
        if (val != 0)
            buffer[index++] = (byte)val;
        temp = temp >> 8; 
    }
    return index;
}


